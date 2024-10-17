package Lab3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Status {
    TO_DO,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}

class TaskItem {
    private int taskId;
    private String taskDescription;
    private Status taskStatus;

    public TaskItem(int taskId, String taskDescription, Status taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Status getTaskStatus() {
        return taskStatus;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();
    private DbConnect dbConnect;

    public DataStructures() {
        dbConnect = new DbConnect();
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED)
        );
    }

    public List<TaskItem> fetchAllTasks() {
        return dbConnect.fetchAllTasks();
    }

    public TaskItem fetchTaskById(int taskId) {
        return dbConnect.fetchTaskById(taskId);
    }

    public void createTask(TaskItem task) {
        dbConnect.createTask(task);
    }

    public void updateTask(int taskId, String newDescription) {
        dbConnect.updateTask(taskId, newDescription);
    }

    public void printAllTasks() {
        List<TaskItem> allTasks = fetchAllTasks();
        for (TaskItem task : allTasks) {
            System.out.println(task.getTaskId() + ": " + task.getTaskDescription() + " - " + task.getTaskStatus());
        }
    }

    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();

        System.out.println("All Tasks:");
        dataStructures.printAllTasks();

        TaskItem specificTask = dataStructures.fetchTaskById(1);
        if (specificTask != null) {
            System.out.println("Fetched Task: " + specificTask.getTaskDescription());
        }

        TaskItem newTask = new TaskItem(4, "New Task Example", Status.TO_DO);
        dataStructures.createTask(newTask);
        System.out.println("Created Task: " + newTask.getTaskDescription());

        dataStructures.updateTask(2, "Updated Task Description");
        System.out.println("Updated Task with ID 2");
    }
}
