package day06.practice;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class TestRemoveDuplicate {

	@Test
	public void testValidRemoveDuplicate() {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Chennai");
		cityList.add("Mumbai");

		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Chennai");
		expectedList.add("Bangalore");
		expectedList.add("Mumbai");

		List<String> acutalList = RemoveDuplicates.removeDuplicate(cityList);

		assertEquals(expectedList, acutalList);

	}

	@Test
	public void testInvaildNullArrayList() throws IllegalArgumentException {

		try {
			RemoveDuplicates.removeDuplicate(null);
			fail("Null ArrayList Test Case Is Failded");
		} catch (IllegalArgumentException ex) {
			assertEquals("Array mush have elements", ex.getMessage());
		}

	}

}