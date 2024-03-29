package com.fssa.specsee.daolayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fssa.specsee.connections.ConnectionUtil;
import com.fssa.specsee.enums.OrderStatus;
import com.fssa.specsee.exceptions.DAOException;
import com.fssa.specsee.logger.Logger;
import com.fssa.specsee.modelobjects.Order;
import com.fssa.specsee.modelobjects.OrderProduct;
import com.fssa.specsee.validator.OrderErrorMessages;

public class OrderDAO {

	public static void addOrder(Order order) throws DAOException, SQLException {

		try (Connection connection = ConnectionUtil.getConnection()) {
			// SQL query to insert the order information into the 'orders' table
			String insertQuery = "INSERT INTO `orders` (ordered_date, user_id, total_amount, status, address,phoneNumber) VALUES (?, ?, ?, ?,?,?)";

			// Execute insert statement
			try (PreparedStatement pst = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {

				pst.setString(4, order.getStatus().toString());
				pst.setInt(2, order.getUserID());
				pst.setDouble(3, order.getTotalAmount());
				pst.setString(1, order.getOrderedDate() + "");
				pst.setString(5, order.getAddress());
				pst.setString(6, order.getPhoneNumber());

				int affectedRows = pst.executeUpdate();
				int orderId;
				if (affectedRows == 0) {
					throw new SQLException("Adding order failed, no rows affected.");
				}

				try (ResultSet generatedKeys = pst.getGeneratedKeys()) {
					if (generatedKeys.next()) {
						orderId = generatedKeys.getInt(1);
						System.out.println("orderId : " + orderId);
					} else {
						throw new SQLException("Creating user failed, no ID obtained.");
					}
				}
				addOrderItems(order.getProductsList(), orderId);
				Logger.info("row/rows affected: " + affectedRows);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			throw new DAOException(OrderErrorMessages.ORDER_CREATION_FAILED);
		}
	}

	public static void addOrderItems(List<OrderProduct> orderProducts, int orderId) throws DAOException, SQLException {

		try (Connection connection = ConnectionUtil.getConnection()) {
			// SQL query to insert the order information into the 'orders' table
			String insertQuery = "INSERT INTO order_items (order_id, product_id, price, quantity,total_amount, status) VALUES (?, ?, ?, ?,?,?)";

			// Execute insert statement
			try (PreparedStatement pst = connection.prepareStatement(insertQuery)) {

				for (OrderProduct orderProduct : orderProducts) {

					pst.setInt(1, orderId);
					pst.setInt(2, orderProduct.getProductId());
					pst.setDouble(3, orderProduct.getProductPrice());
					pst.setInt(4, 1);
					pst.setDouble(5, orderProduct.getTotalAmount());
					pst.setString(6, OrderStatus.ORDERED + "");

					// Execute the insert statement and get the number of affected rows
					int rowsAffected = pst.executeUpdate();
				}
				Logger.info("Odered products addded to the ordered_products table successfully");
			}
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new DAOException(OrderErrorMessages.ORDER_CREATION_FAILED);
		}
	}

	private static boolean checkOrderExists(int orderId) throws DAOException, SQLException {
		try (Connection connection = ConnectionUtil.getConnection()) {
			String query = "SELECT COUNT(*) FROM orders WHERE orderId = ?";
			try (PreparedStatement pst = connection.prepareStatement(query)) {
				pst.setInt(1, orderId);
				try (ResultSet resultSet = pst.executeQuery()) {
					if (resultSet.next()) {
						int count = resultSet.getInt(1);
						return count > 0; // If count > 0, order with the ID exists
					}
				}
			}
		}
		return false;
	}

	public static ArrayList<Order> getOrderById(int userId) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection()) {
			String query = "SELECT * FROM orders WHERE user_id = ?";
			try (PreparedStatement pst = connection.prepareStatement(query)) {
				pst.setInt(1, userId);

				
				try (ResultSet resultSet = pst.executeQuery()) {
					ArrayList<Order> orders = new ArrayList<Order>();
					while(resultSet.next()) {
						Order order = new Order();
						order.setOrderId(resultSet.getInt("orderId"));
						order.setTotalAmount(resultSet.getDouble("total_amount"));
						order.setOrderDate(resultSet.getDate("ordered_date").toLocalDate());
						order.setStatus(OrderStatus.valueOf(resultSet.getString("status")));
						order.setAddress(resultSet.getString("address"));
						order.setPhoneNumber(resultSet.getString("phoneNumber"));
						order.setProductsList(getOrderedProductsByOrderId(resultSet.getInt("orderId")));
						orders.add(order);
					
					}
					return orders;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(OrderErrorMessages.ORDER_RETRIEVAL_FAILED);
		}
		
	}
	
	
	public static ArrayList<OrderProduct> getOrderedProductsByOrderId(int orderId) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection()) {
			String query = "SELECT * FROM order_items WHERE order_id = ?";
			try (PreparedStatement pst = connection.prepareStatement(query)) {
				pst.setInt(1, orderId);
				ArrayList<OrderProduct> orderProducts = new ArrayList<OrderProduct>();

				try (ResultSet resultSet = pst.executeQuery()) {
					while (resultSet.next()) {
						OrderProduct orderProduct = new OrderProduct();
						orderProduct.setProductId(resultSet.getInt("product_id"));
						orderProduct.setProductPrice(resultSet.getDouble("price"));
						orderProduct.setTotalAmount(resultSet.getDouble("total_amount"));
						orderProduct.setQuantity(resultSet.getInt("quantity"));
						orderProducts.add(orderProduct);
					}
					return orderProducts;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(OrderErrorMessages.ORDER_RETRIEVAL_FAILED);
		}

	}
	public static boolean cancelOrder(int orderId) throws DAOException {
		String updateQuery = "UPDATE `orders` SET status = 'CANCELLED' WHERE orderId = ?";

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {

			preparedStatement.setInt(1, orderId);
			int rowsAffected = preparedStatement.executeUpdate();
			System.out.println("order id : " + orderId + " is cancelled successfully");

			return rowsAffected > 0; // Return true if the order was canceled successfully

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

			return false;
		}
	}

	public static void deleteOrderedProductsByOrderId(int orderId) throws DAOException {
		if (orderId <= 0) {
			throw new DAOException("Order ID cannot be zero or negative");
		}

		try (Connection connection = ConnectionUtil.getConnection()) {
			String deleteQuery = "DELETE FROM `orders` WHERE orderId = ?";

			try (PreparedStatement pst = connection.prepareStatement(deleteQuery)) {
				pst.setInt(1, orderId);
				int rowsAffected = pst.executeUpdate();

				if (rowsAffected == 0) {
					// Handle the case where no rows were deleted (order not found)
					throw new DAOException("Order with ID " + orderId + " not found.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("Order deletion failed: " + e.getMessage());
		}

	}

}

