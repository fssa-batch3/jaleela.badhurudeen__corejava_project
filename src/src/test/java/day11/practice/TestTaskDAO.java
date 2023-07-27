package day11.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskDAO {
	@Test
	void testCreateTask() throws DAOException {
		Task task = new Task("jaleela","process");
		Assertions.assertTrue(TaskDAO.createTask(task));
	}
	@Test
	void testInvalidCreateTask(){
		try {
			Assertions.assertTrue(TaskDAO.createTask(null));
		} catch (DAOException e) {
			Assertions.assertEquals("cannot run prepared statement", e.getMessage());
			e.printStackTrace();
		}
	}
}