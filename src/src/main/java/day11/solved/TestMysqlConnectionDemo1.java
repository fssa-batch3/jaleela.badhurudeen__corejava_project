package day11.solved;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author BharathwajSoundarara
 *
 */
public class TestMysqlConnectionDemo1 {
	/**
	 * @param args
	 */

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/<YOURDB>", "USERNAME","PASSWORD");
				
				
														
		System.out.println(conn);

	}
}