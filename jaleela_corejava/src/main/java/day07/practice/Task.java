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
import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Task {
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

    public void setId(int id) {
        this.id = id;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Task task = (Task) obj;
        return name.equals(task.name) && deadline.equals(task.deadline);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + deadline.hashCode();
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", deadline=" + deadline ;
    }

    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<>();

        // Adding tasks with the same name and deadline
        taskList.add(new Task(1, "Task 1", LocalDate.parse("2023-07-14")));
        taskList.add(new Task(2, "Task 1", LocalDate.parse("2023-07-14")));
        taskList.add(new Task(3, "Task 1", LocalDate.parse("2023-07-14")));
        taskList.add(new Task(4, "Task 2", LocalDate.parse("2023-07-14")));
        taskList.add(new Task(5, "Task 2", LocalDate.parse("2023-07-14")));

        System.out.println("Before remove the duplicates with HashSet");
for (Task task : taskList) {
            System.out.println(task);
        }

        HashSet<Task> taskAfter = new HashSet<>(taskList);

        System.out.println("After remove the duplicates with HashSet");
        for (Task task : taskAfter) {
            System.out.println(taskAfter);
        }
    }
}
