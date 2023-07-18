
package day02.practice;
import java.util.*;

/*
 * Create a logger class and utility methods (log, debug , error) and 
 * accepts different parameters
*/
	public class Logger {
		
		public static void info (String msg) {
			// TODO complete this code using the above template
			System.out.println("INFO: " + msg);

		}
		public static void debug (String msg) {
			System.out.println("DEBUG: " + msg);
		}
		public static void error (String msg) {
			// TODO complete this code using the above template
			System.out.println("ERROR: " + msg);

		}
		
		
		public static void info (int num) {
			// TODO complete this code using the above template
			System.out.println("INFO: " + num);

		}
		
		public static void debug (int num2) {
			System.out.println("DEBUG: " + num2);

			// TODO Complete this code
		}
		
		
		public static void error (int num3) {
			// TODO complete this code using the above template
			System.out.println("ERROR: " + num3);

		}
		public static void main(String[] args) {
			
			Logger logger = new Logger();
			logger.info("info");
			logger.debug("debug");
			logger.error("error");
			logger.info(1);
			logger.debug(2);
			logger.error(3);

			
			
			
		}
		// Similarly write overloaded methods for error and info.
	}