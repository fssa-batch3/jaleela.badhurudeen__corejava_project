package com.fssa.specsee.servicelayer;

import java.sql.SQLException;

import com.fssa.specsee.daolayer.OrderDAO;
import com.fssa.specsee.exceptions.CustomException;
import com.fssa.specsee.exceptions.DAOException;
import com.fssa.specsee.modelobjects.Order;
import com.fssa.specsee.validator.OrderValidator;

	public class OrderService {
		public static boolean addOrder(Order order) throws DAOException, CustomException, SQLException {

			if (OrderValidator.validateOrder(order)) {

				OrderDAO.addOrder(order);
				return true;
			}
			return false; 
			
		}
	}
