package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHashMapDemo3 {





    @Test
    public void testDepartmentEmployeesMapping() {
        String[] input = {
            "HR,Ram",
            "HR,Suresh",
            "IT,Basker",
            "IT,Joseph",
            "Admin,Sundar"
        };

        HashMapDemo3 demo3 = new HashMapDemo3();

        Map<String, List<String>> deptEmployeesMap = demo3.buildDeptEmployeesMap(input);

        // Check the expected mapping of department to employees
        Assertions.assertEquals(List.of("Ram", "Suresh"), deptEmployeesMap.get("HR"));
        Assertions.assertEquals(List.of("Basker", "Joseph"), deptEmployeesMap.get("IT"));
        Assertions.assertEquals(List.of("Sundar"), deptEmployeesMap.get("Admin"));
    }
}
