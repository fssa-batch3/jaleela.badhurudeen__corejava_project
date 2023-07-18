/*
 * Question#2: Read a list Task(id, name, deadline) and print them in sorted order by deadline

use the below sample class

```java
class Task {
	private int id;
	private String name;
  private LocalDate deadline;
}
```

Sample Input

3,Coding,2022-10-22

5,"Product Design",2022-10-01

1,"Software Design", "2022-10-07"

3,Coding,2022-10-22

Sample Output

5,Product Design,2022-10-01

1,Software Design, 2022-10-07

3,Coding,2022-10-22

3,Coding,2022-10-22
 */

package day09.practice;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Task {
    private int id;
    private String name;
    private LocalDate deadline;
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
}

public class SortedByDeadLine {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        List<Task> tasks = new ArrayList<>();
	        System.out.println("Enter the number of tasks:");
	        int n = sc.nextInt();
	        sc.nextLine();
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter Task id:");
	            int id = sc.nextInt();
	            sc.nextLine();
	            System.out.println("Enter Task  name:");

	            String name = sc.nextLine();
	            System.out.println("Enter Task deadline in this 'yyyy-MM-dd' format:");

	            LocalDate deadline = LocalDate.parse(sc.nextLine());
	            tasks.add(new Task(id, name, deadline));
	        }
	        Collections.sort(tasks, Comparator.comparing(Task::getDeadline));
	        for (Task task : tasks) {
	            System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
	        }
	        sc.close();
	  
	
}
}
