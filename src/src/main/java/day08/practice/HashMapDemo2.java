/*
 * Question#1: Read comma separated list of names from the user and print count 

HINT: Use a `HashMap<String, Integer>`

Sample Input

Enter the string: Ram, Ram, Superman, spider, hey, hello, hey, Spider

Output

Ram: 2

Superman: 1

Spider: 2

hey: 2

hello: 1
 * 
 */




package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter names here");
		String[] names = new String[10];
		

		for(int j=0;j<10;j++) {
	names[j]=sc.next().toLowerCase();
			
		}
		
        Map<String, Integer> countMap = new HashMap<String, Integer>();

        for (int i = 0; i < names.length; i++) {
            if (countMap.get(names[i]) == null) {
                countMap.put(names[i], 1);
            } else {
                int count = countMap.get(names[i]);
                count++;
                countMap.put(names[i], count);
            }
        }
		
		
		
		
        System.out.println(countMap);

		
		
		
		
		
		sc.close();

	}

	

	
	
}
