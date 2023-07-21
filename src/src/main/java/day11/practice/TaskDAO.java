package day11.practice;


import java.sql.*;


public class TaskDAO {
	

	public static boolean createTask(Task task) throws DAOException {// User defined Exception
		// Write code here to get connection
		if(task == null) {
			throw new DAOException("cannot run prepared statement");
		}
		String url = "jdbc:mysql://localhost:3306/task"; // url for to connect local database

		String user = "root"; // user of local database

		String password = "password"; // password of local database
		
		Connection connection;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new DAOException("cannot create connection");
		}
		// Create insert statement
		String query = "insert into task(name, status) values (?,?)";

		// Execute insert statement
		try {
			PreparedStatement pst = connection.prepareStatement(query);
			pst.setString(1, task.name);
			pst.setString(2, task.status);
			pst.executeUpdate();
		} catch (SQLException e) {
			
			throw new DAOException("cannot run prepared statement");
		}
		// close connection
		try {
			connection.close();
		} catch (SQLException e) {
			throw new DAOException("cannot close connection");

		}
		System.out.println("Task completed");
		return true;
	}

}


// Create Junit Test case and test the TaskDao.createTask method