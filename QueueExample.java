package test;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> myQueue = new LinkedList<>();

        // Enqueue elements to the queue
        myQueue.offer("Apple");
        myQueue.offer("Banana");
        myQueue.offer("Cherry");
        myQueue.offer("Date");

        // Displaying the elements in the queue
        System.out.println("Queue elements: " + myQueue);

        // Dequeue elements from the queue
        String removedElement = myQueue.poll();
        System.out.println("Removed element: " + removedElement);

        // Displaying the elements in the queue after dequeue
        System.out.println("Queue elements after dequeue: " + myQueue);

        // Peek the front element without removing it
        String frontElement = myQueue.peek();
        System.out.println("Front element: " + frontElement);

        // Displaying the elements in the queue after peek
        System.out.println("Queue elements after peek: " + myQueue);
    }
}

