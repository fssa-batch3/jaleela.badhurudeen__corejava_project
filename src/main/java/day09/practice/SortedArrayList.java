/*
 * Question#1: Using the ArrayList<Integer> sort a list of integers read from the user

Sample Input: 

*Enter numbers: 8 9 45 12 1*

Sample Output: 

*Sorted list: 1 8 9 12 45*
 * 
 * 
 */



package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class SortedArrayList {

	public static void main(String[] args) {
//		ArrayList<Integer> IntegerArray =new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int count=0;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		while(count<n) {
			System.out.println("enter numbers");
			int number=sc.nextInt();
		arr.add(number);
			count++;
		}
		
		Collections.sort(arr);
		for(int sortedNumber :arr) {
			System.out.println(sortedNumber);
			
		}
		
		sc.close();
		
		
		
		
		
	}
}
