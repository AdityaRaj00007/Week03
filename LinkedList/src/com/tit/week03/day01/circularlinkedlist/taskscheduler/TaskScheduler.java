package com.tit.week03.day01.circularlinkedlist.taskscheduler;
import java.util.Scanner;

public class TaskScheduler {
    public static void main(String[] args) {
        TaskSchedulerLinkedList taskScheduler = new TaskSchedulerLinkedList();
        Scanner scanner = new Scanner(System.in);

        taskScheduler.addAtEnd(1, "Task A", 2, "2025-02-10");
        taskScheduler.addAtBeginning(2, "Task B", 1, "2025-02-15");
        taskScheduler.addAtPosition(2, 3, "Task C", 3, "2025-03-01");

        taskScheduler.displayAllTasks();

        System.out.println("View current task and move to next:");
        taskScheduler.viewAndMoveToNext();

        System.out.println("\nSearch tasks by priority (Enter 1):");
        taskScheduler.searchByPriority(1);

        System.out.println("\nRemoving Task B...");
        taskScheduler.removeByTaskId(2);
        taskScheduler.displayAllTasks();

        scanner.close();
    }
}
