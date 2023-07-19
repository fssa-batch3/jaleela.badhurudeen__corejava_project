
/*Question#2: Write code to read a comma separated DeptName, EmployeeName and output DeptName, List of Employees

HINT: Use `HashMap<String, List<String>>`

Sample Input

HR,Ram

HR, Suresh

IT, Basker

IT, Joseph

Admin, Sundar

Output

HR: Ram, Suresh

IT: Basker, Joseph

Admin: Sundar
 * 
 * 
 * 
 */


package day08.practice;
import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo3 {
	
	 public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);
		 Map<String, List<String>> DeptNames = new HashMap<>();


		 for(int i=0;i<5;i++) {
		 	System.out.println("Enter comma seperated input ");
		 	String str=scan.nextLine();
		 	if(str==null || "".equals(str)) {
		 		
		 		throw new IllegalArgumentException("Input cant't be Empty or Null");
		 	}
		 	
		 	String [] arrstr=str.split(",");
		 	
		 	if(arrstr.length<2 || arrstr.length>2 ) {
		 		throw new IllegalArgumentException("Input should have deparment and name");
		 	}
		 	
		 	if(DeptNames.get(arrstr[0])==null) {
		 		DeptNames.put(arrstr[0], new ArrayList<>());
		 		DeptNames.get(arrstr[0]).add(arrstr[1]);
		 	}
		 	else {
		 		DeptNames.get(arrstr[0]).add(arrstr[1]);
		 	}
		 	
		 }
		 System.out.println(DeptNames);
		 
		 
		 
		 
		 
		 
		 
		 
}
}