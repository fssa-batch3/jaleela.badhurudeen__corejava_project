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
         
 
    }
}
