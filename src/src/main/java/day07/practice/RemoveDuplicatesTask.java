/*
 * Create a ArrayList<Task> of Task with tasks having the same name and deadline.
 *  Use an HashSet<Task> to remove duplicate Task
 * 
 * class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	
}
 */




package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

class Task {
	 int id;
	 String name;
	 LocalDate deadline;
	
	   
	    public Task(int id, String name, LocalDate deadline) {
	        this.id = id;
	        this.name = name;
	        this.deadline = deadline;
	    }
	   
	    public int getId() {
	        return id;
	    }
	   
	    public String getName() {
	        return name;
	    }
	   
	    public LocalDate getDeadline() {
	        return deadline;
	    }
	   
	   
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Task task2 = (Task) obj;
	        return id == task2.id && name.equals(task2.name) && deadline.equals(task2.deadline);
	    }
	   
	   
	    public int hashCode() {
	        return id;
	    }
}
public class RemoveDuplicatesTask {
   public static void main(String[] args) {
	  
	   ArrayList<Task> newTask = new ArrayList<>();
	   newTask.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
	   newTask.add(new Task(2, "Task 2", LocalDate.of(2023, 8, 15)));
	   newTask.add(new Task(3, "Task 2", LocalDate.of(2023, 9, 15)));
	   newTask.add(new Task(4, "Task 3", LocalDate.of(2023, 7, 15)));
       newTask.add(new Task(5, "Task 4", LocalDate.of(2023, 7, 16)));
       System.out.println("without using Hash Set and with  duplication");
       for (Task task : newTask) {
           System.out.println(task.getId() + " , " + task.getName() + " , " + task.getDeadline());
       }
       HashSet<Task> Task2 = new HashSet<>(newTask);
       System.out.println("Using Hash Set and without  duplication");
       for (Task task : Task2) {
           System.out.println(task.getId() + " , " + task.getName() + " , " + task.getDeadline());
       }
	  
  }
}

























