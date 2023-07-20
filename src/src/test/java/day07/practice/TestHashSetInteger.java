package day07.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHashSetInteger {
	
	@Test
	public void testValidArray() {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		
		
		HashSet<Integer> uniqueArr = new HashSet<Integer>(Arrays.asList(2, 4, 5, 7));
		try {
			TestHashSetInteger.removeDuplicateElements(arr);
			boolean valid=TestHashSetInteger.validateDuplicatemethod(arr, uniqueArr);
//			Assertions.assertTrue(valid);
			Assertions.fail("Validatepriority failed");
		}
		catch(Exception ex) 
		{
			Assertions.assertEquals("The array does not contain all unique elements.", ex.getMessage());
		}

	}
	
	
	
	
	private static boolean validateDuplicatemethod(ArrayList<Integer> arr, HashSet<Integer> uniqueArr) {
		// TODO Auto-generated method stub
		return false;
	}




	private static void removeDuplicateElements(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		
	}




	@Test
	public void testInValidArray() {

		try {
			TestHashSetInteger.removeDuplicateElements(null);
			Assertions.fail("Validatepriority failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Array cannot be null", ex.getMessage());
		}

	

	}
	
}