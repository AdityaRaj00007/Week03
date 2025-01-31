package com.tit.week03.day02.stackandqueue.sortusingrecursion;
import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StackSorter stackSorter = new StackSorter();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack:");
        displayStack(stack);

        stackSorter.sortStack(stack);

        System.out.println("Sorted Stack:");
        displayStack(stack);
    }

    // Display stackandqueue elements
    public static void displayStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements: " + stack);
        }
    }
}
