package com.tit.week03.day01.circularlinkedlist.taskscheduler;
public class TaskSchedulerLinkedList {
    private TaskNode head;
    private TaskNode current;

    // Add task at the beginning
    public void addAtBeginning(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            head = newNode;
            temp.next = head;
        }
    }

    // Add task at the end
    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add task at a specific position
    public void addAtPosition(int position, int taskId, String taskName, int priority, String dueDate) {
        if (position <= 0) {
            System.out.println("Invalid position. Use 1 or higher.");
            return;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (position == 1) {
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        int count = 1;

        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        if (count == position - 1) {
            newNode.next = temp.next;
            temp.next = newNode;
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    // Remove task by Task ID
    public void removeByTaskId(int taskId) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head, prev = null;

        // Handle head node deletion
        if (head.taskId == taskId) {
            if (head.next == head) {
                head = null;
                return;
            }
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
            return;
        }

        prev = head;
        temp = head.next;

        while (temp != head) {
            if (temp.taskId == taskId) {
                prev.next = temp.next;
                System.out.println("Task with ID " + taskId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        }

        System.out.println("Task with ID " + taskId + " not found.");
    }

    // View current task and move to the next task
    public void viewAndMoveToNext() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (current == null) {
            current = head;
        }

        System.out.println("Current Task:");
        System.out.println("Task ID: " + current.taskId);
        System.out.println("Task Name: " + current.taskName);
        System.out.println("Priority: " + current.priority);
        System.out.println("Due Date: " + current.dueDate);
        System.out.println();

        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks found.");
            return;
        }

        TaskNode temp = head;
        System.out.println("\nTask List:");
        do {
            System.out.println("Task ID: " + temp.taskId);
            System.out.println("Task Name: " + temp.taskName);
            System.out.println("Priority: " + temp.priority);
            System.out.println("Due Date: " + temp.dueDate);
            System.out.println();
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a task by Priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                System.out.println("Task Found:");
                System.out.println("Task ID: " + temp.taskId);
                System.out.println("Task Name: " + temp.taskName);
                System.out.println("Due Date: " + temp.dueDate);
                System.out.println();
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with priority " + priority + ".");
        }
    }
}
