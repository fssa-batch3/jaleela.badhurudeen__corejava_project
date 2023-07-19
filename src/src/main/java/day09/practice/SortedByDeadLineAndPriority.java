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
class AdditinalTask {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;
    public AdditinalTask(int id, String name, LocalDate deadline, int priority) {
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
class TaskComparator implements Comparator<AdditinalTask> {
    public int compare(AdditinalTask t1, AdditinalTask t2) {
        int deadlineComparison = t1.getDeadline().compareTo(t2.getDeadline());
        if (deadlineComparison != 0) {
            return deadlineComparison;
        }
        return Integer.compare(t1.getPriority(), t2.getPriority());
    }
}
public class SortedByDeadLineAndPriority {
    public static void main(String[] args) {
        List<AdditinalTask> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of tasks:");
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        while (count < n) {
            System.out.println("Enter the task details of " + (count + 1) + " as id, name, priority, deadline (in yyyy-MM-dd format):");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            LocalDate deadline = LocalDate.parse(sc.nextLine());
            int priority = sc.nextInt();
            tasks.add(new AdditinalTask(id, name, deadline, priority));
            count++;
        }
        Collections.sort(tasks, new TaskComparator());
        for (AdditinalTask task : tasks) {
            System.out.println(task.getId() + "," + task.getName() + "," + task.getPriority() + "," + task.getDeadline());
        }
        
    }
}