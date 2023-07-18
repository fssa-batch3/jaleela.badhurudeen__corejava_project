package day06.practice;

import java.util.ArrayList;
class NewTask {
	
	 private String name;
	
	    public NewTask(String name) {
	        this.name = name;
	    }
	    public String getName() {
	        return name;
	    }
}
public class findTaskByName {
   public static void main(String[] args) {
	   ArrayList<NewTask> tasks = new ArrayList<>();
       tasks.add(new NewTask("walking"));
       tasks.add(new NewTask("jogging"));
       tasks.add(new NewTask("running"));
       boolean exists = findTaskByName("Exercise", tasks);
       System.out.println("Task Status : " + exists);
   }
   public static  boolean findTaskByName(String name, ArrayList<NewTask> tasks) {
       for (NewTask task : tasks) {
           if (task.getName().equals(name)) {
               return true;
           }
       }
       return false;
}
}