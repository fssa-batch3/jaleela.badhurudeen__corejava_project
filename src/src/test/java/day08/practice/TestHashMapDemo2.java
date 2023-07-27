package day08.practice;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day08.solved.HashMapDemo;
public class TestHashMapDemo2 {
	
	
	@Test
	public void testValidCount() {

		 String input = "Ram,Ram,Superman,Spider,hey,hello,Spider";
      Map<String, Integer> countMap = HashMapDemo.countRepetation(input);

	        Assertions.assertEquals(2, countMap.get("Ram"));
	        Assertions.assertEquals(1, countMap.get("Superman"));
	        Assertions.assertEquals(2, countMap.get("Spider"));
	        Assertions.assertEquals(1, countMap.get("hey"));
	        Assertions.assertEquals(1, countMap.get("hello"));

	}
	
	
	
	
	@Test
	public void testInValidCount() {

		try {
			HashMapCount1.countRepetation(null);
			Assertions.fail("Validatevcount failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("A string cannot be null or empty", ex.getMessage());
		}

	

	}
	
	
	

}