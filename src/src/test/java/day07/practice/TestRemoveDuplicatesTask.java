package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicatesTask {

    @Test
    public void testRemoveDuplicates() {
        ArrayList<Task> newTask = new ArrayList<>();
        newTask.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
        newTask.add(new Task(2, "Task 2", LocalDate.of(2023, 8, 15)));
        newTask.add(new Task(3, "Task 2", LocalDate.of(2023, 9, 15)));
        newTask.add(new Task(4, "Task 3", LocalDate.of(2023, 7, 15)));
        newTask.add(new Task(5, "Task 4", LocalDate.of(2023, 7, 16)));

        // Create a HashSet from the ArrayList to remove duplicates
        HashSet<Task> uniqueTasks = new HashSet<>(newTask);

        // Assert that the size of the HashSet is equal to the expected number of unique tasks
        Assertions.assertEquals(5, uniqueTasks.size());

        // You can add further assertions to check the specific content of the HashSet if needed
        // For example, you could check if a certain task is present in the set.

        // Here's an example of checking if a specific task is present in the HashSet:
        Task taskToCheck = new Task(2, "Task 2", LocalDate.of(2023, 9, 15));
        Assertions.assertFalse(uniqueTasks.contains(taskToCheck));
    }
}
