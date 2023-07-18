/*
 * Question#3 : Learn about Comparator and try implementing a logic
 *  where we take additional attribute for the Task called “priority” 
 *  and if two tasks are pending on the same day, the sorting should be able to sort
 *   using both deadline and priority.
 * 
 */


package day09.practice;




import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class CustomTask {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;
    public CustomTask(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
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
    public int getPriority() {
        return priority;
    }
}
class TaskComparator implements Comparator<CustomTask> {
    public int compare(CustomTask t1, CustomTask t2) {
        int deadlineComparison = t1.getDeadline().compareTo(t2.getDeadline());
        if (deadlineComparison != 0) {
            return deadlineComparison;
        }
        return Integer.compare(t1.getPriority(), t2.getPriority());
    }
}
public class SortedByDeadLineAndPriority {
    public static void main(String[] args) {
        List<CustomTask> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of tasks:");
        int n = scanner.nextInt();
        scanner.nextLine();
        int count = 0;
        while (count < n) {
            System.out.println("Enter the task details of " + (count + 1) + " as id, name, priority, deadline (in yyyy-MM-dd format):");
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            LocalDate deadline = LocalDate.parse(scanner.nextLine());
            int priority = scanner.nextInt();
            tasks.add(new CustomTask(id, name, deadline, priority));
            count++;
        }
        Collections.sort(tasks, new TaskComparator());
        for (CustomTask task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getPriority() + "," + task.getDeadline());
        }
    }
}