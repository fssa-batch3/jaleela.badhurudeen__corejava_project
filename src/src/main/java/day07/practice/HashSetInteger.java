/*
 *  Create an ArrayList<Integer> of numbers with duplicate entries. 
 *  Use an HashSet<Integer> to remove the duplicates and display the Unique values
 * 
 * 
 */


package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetInteger {

	 
    public static void main(String[] args) {
 
        //Without using hash set duplicates
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(10);
 
        System.out.println("Using ArrayList :" + numbers);
         
        // using hash set duplicates
        HashSet<Integer> numbers2 = new HashSet<Integer>();
        numbers2.add(5);
        numbers2.add(4);
        numbers2.add(3);
        numbers2.add(10);
 
        System.out.println("Using Set :" + numbers2);
        removeDuplicateElements(numbers2);
        }
        public static void removeDuplicateElements(HashSet<Integer> numbers2) throws IllegalArgumentException {
    		if (numbers2 == null) {
    			throw new IllegalArgumentException("Array cannot be null");
    		}
    		// Set stores unique elements and ignores duplication
    		HashSet<Integer> uniqueArr = new HashSet<Integer>(numbers2);

    		System.out.println("Using  Hasset to remove duplicates");
    		for (Integer arr1 : uniqueArr) {
    			System.out.print(arr1 + " ");

    		}

    	}

    	public static boolean validateDuplicatemethod(ArrayList<Integer> numbers, HashSet<Integer> uniqueArr)
    			throws Exception {
    		HashSet<Integer> set = new HashSet<>(numbers);

    		if (!set.equals(uniqueArr)) {
    			throw new Exception("The array does not contain all unique elements.");

    		}
    		return true;

    	}

    }