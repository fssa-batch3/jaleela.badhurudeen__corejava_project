package day12.practice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import day11.practice.DAOException;

public class TaskDAO {
	public static void main(String[] args) throws DAOException {
		Task task = new Task();
//		task.id = 1;
		task.name = "practice";
		task.status = "completed";
//		createTask(task);
		
		
		getAllTasks();
	}
	public static Connection getConnection() {

		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/task"; // url for to connect local database
		String userName = "root";
		String passWord = "123456";
		try {
//	            Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, userName, passWord);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Unable to connect to the database");
		}
		return con;
	}

	public static void createTask(Task task) throws DAOException {
		// Write code here to get connection
		Connection connection = null; 
		try {
			// Create insert statement
			String query = "INSERT INTO task (name, status) VALUES (?, ?)";
			connection = getConnection();

			// Execute insert statement
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error creating task", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}

	public void updateTask(Task task) throws DAOException {
		// Write code here to get connection
		Connection connection = null;
		try {
			// Create update statement using task id
			String query = "UPDATE task SET name = ?, status = ? WHERE id = ?";
			connection = getConnection();

			// Execute update statement using task id
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.setInt(3, task.id);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error updating task", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}

	public void deleteTask(int taskId) throws DAOException {
		// Write code here to get connection
		Connection connection = null;
		try {
			// Create delete statement using task id
			String query = "DELETE FROM task WHERE id = ?";
			connection = getConnection();

			// Execute delete statement using task id
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setInt(1, taskId);
			pst.executeUpdate();
		} catch (SQLException e) {
			throw new DAOException("Error deleting task", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}

	public static void getAllTasks() throws DAOException {
		// Write code here to get connection
		Connection connection = null;
		try {
			// Create a Select all query with each attribute listed as columns
			String query = "SELECT * FROM task";
			connection = getConnection();

			// Execute query
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			// Iterate over the resultset and convert it to an ArrayList
			List<Task> tasks = new ArrayList<>();
			while (resultSet.next()) {
				Task task = new Task();
				task.id = resultSet.getInt("id");
				task.name = resultSet.getString("name");
				task.status = resultSet.getString("status");
				tasks.add(task);
			}
			for(Task e : tasks) {
				System.out.println("id: "+e.id);
				System.out.println("name: "+e.name);
				System.out.println("status: "+e.status);
				System.out.println();
			}
		} catch (SQLException e) {
			throw new DAOException("Error fetching tasks", e);
		} finally {
			// close connection
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				throw new DAOException("Error closing connection", e);
			}
		}
	}
}