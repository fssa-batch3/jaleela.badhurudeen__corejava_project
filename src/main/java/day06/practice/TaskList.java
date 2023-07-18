package day06.practice;

import java.util.ArrayList;
class Task {
	
    public String taskName;
    public int priority;
    public Task(String taskName, int priority) {
        this.taskName = taskName;
        this.priority = priority;
    }
}
public class TaskList {
   public static void main(String[] args) {
	// Store the Task names in the List
	   ArrayList<Task> TaskList = new ArrayList<>();
	   TaskList.add(new Task("get up", 6));
	   TaskList.add(new Task("ready for go", 7));
	   TaskList.add(new Task("reach the academy", 8
			   ));
       for (Task task : TaskList) {
           System.out.println("Task Name: " + task.taskName);
           System.out.println("Priority: " + task.priority);
           System.out.println();
       }
}
}