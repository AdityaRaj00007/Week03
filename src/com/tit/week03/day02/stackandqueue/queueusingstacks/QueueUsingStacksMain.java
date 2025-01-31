package com.tit.week03.day02.stackandqueue.queueusingstacks;

public class QueueUsingStacksMain {
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        queue.display();
        queue.remove();
        queue.display();
        queue.remove();
        queue.display();

        queue.add(70);
        queue.add(80);
        queue.display();
        
    }
}
