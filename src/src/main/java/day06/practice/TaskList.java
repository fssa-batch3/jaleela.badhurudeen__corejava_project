package day06.practice;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Task {
	
    public String taskName;
    public int priority;
    public Task(String taskName, int priority) {
    	validatetaskName (taskName);
		 validatetaskpriority(priority);
        this.taskName = taskName;
        this.priority = priority;
    }




public static boolean  validatetaskName (String taskName)throws IllegalArgumentException {
	if(taskName==null || taskName.isEmpty()) {
		throw new IllegalArgumentException("TaskName cannot be null or empty");
	}
	String nameregex = "^[a-zA-Z]{2,200}$";
	Pattern pattern = Pattern.compile(nameregex);
	Matcher matcher = pattern.matcher(taskName);
	Boolean isMatch = matcher.matches();



	 if (!isMatch) {
		throw new IllegalArgumentException("The  task name should be  minimum 2 letters and maximum 200 letters");

	}
	 return true;

	
}
public static boolean  validatetaskpriority(int priority)throws IllegalArgumentException {
	if(priority<=0) {
		throw new IllegalArgumentException("InValid priority");
	}
	return true;
	
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
}