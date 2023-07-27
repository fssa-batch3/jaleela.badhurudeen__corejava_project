package day12.practice;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import day11.practice.DAOException;

public class TestTaskDAO {

    
    @Test
    public void testCreateTask() throws DAOException {
        // Create a new Task object with test data
        Day12Task task = new Day12Task();
        task.name = "Test Task";
        task.status = "New";

        // Call the createTask method
        TaskDAO.createTask(task);

        // Now, you can retrieve the task using getAllTasks and verify if it was created successfully
        List<Day12Task> allTasks = TaskDAO.getAllTasks();
        boolean taskFound = false;
        for (Day12Task t : allTasks) {
            if (t.name.equals("Test Task") && t.status.equals("New")) {
                taskFound = true;
                break;
            }
        }

        // Assert that the task was found in the list
        assertEquals(true, taskFound);
    }

    @Test
    public void testGetAllTasks() throws DAOException {
        // This test case will check if the getAllTasks method returns a non-empty list
        List<Day12Task> allTasks = TaskDAO.getAllTasks();

        // Assert that the list is not null and not empty
        assertEquals(false, allTasks.isEmpty());
    }
}