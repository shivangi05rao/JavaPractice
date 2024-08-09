package collectionframework.allinone;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        //Adding elements to the Queue
        queue.add("Element 1");
        queue.offer("Element 2");

        //Displaying the Queue
        System.out.println("Queue: " + queue);

        //Removing elements from Queue
        String removeElement1 = queue.element();
        System.out.println("Removed Element 1: " + removeElement1);

        String removeElement2 = queue.poll();
        System.out.println("Removed Element 2: " + removeElement2);

        // Displaying the updated Queue
        System.out.println("Updated Queue: " + queue);

        // Examining elements in the Queue
        String peekedElement = queue.peek();
        System.out.println("Peeked Element: " + peekedElement);

        String element = queue.element();
        System.out.println("Element at the head: " + element);
    }
}
