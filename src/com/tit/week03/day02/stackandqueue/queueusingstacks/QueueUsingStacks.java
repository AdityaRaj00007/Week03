package com.tit.week03.day02.stackandqueue.queueusingstacks;
import java.util.Stack;
public class QueueUsingStacks {
    Stack<Integer> enqueueStack = new Stack<>();
    Stack<Integer> dequeueStack = new Stack<>();
    // Method to add data in queue
    public void add(int data){
        enqueueStack.push(data);
        System.out.println("Added: " + data);
    }
    // Method to remove data from queue
    public int remove(){
        if(dequeueStack.isEmpty()){
            if(enqueueStack.isEmpty()){
                System.out.println("Queue is Empty");
            }
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }
    // Method to peek
    public int peek(){
        if(dequeueStack.isEmpty()){
            if(enqueueStack.isEmpty()){
                System.out.println("Queue is Empty");
            }
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.peek();
    }
    // check if the queue is empty
    public boolean isEmpty(){
        return enqueueStack.isEmpty() && dequeueStack.isEmpty();
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue elements: ");

        // Print elements in dequeueStack (already in correct order)
        for (int i = dequeueStack.size() - 1; i >= 0; i--) {
            System.out.print(dequeueStack.get(i) + " ");
        }

        // Print elements in enqueueStack (in reverse order)
        for (int value : enqueueStack) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

}
