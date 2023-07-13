/*
 * List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
 * 
 * 
 */



package day06.practice;

import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		// removing mumbai city in that array
		
		List<String> cityList2 = new ArrayList<String>();

		
		// print the city list after removing mumbai city
		System.out.println("Before removing duplicates");
		System.out.println(cityList);
		
		for(String element:cityList) {
			
			if(!cityList2.contains(element)) {
				
				cityList2.add(element);
			}
		}
		
		System.out.println("After removing duplicates");

		System.out.println(cityList2);


	}

	public static void removeDuplicates(List<String> cityList) {
		// TODO Auto-generated method stub
		
	}

}
