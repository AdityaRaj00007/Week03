package com.tit.week03.day02.stackandqueue.sortusingrecursion;
import java.util.Stack;
public class StackSorter {

    // Method to sort the given stackandqueue recursively
    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, temp);
        }
    }

    // Helper method to insert an element at the correct position
    private void insertInSortedOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, element);
        stack.push(temp);
    }
}
