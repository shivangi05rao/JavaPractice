package closerlookatmethodsandclasses;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Creating a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the Deque
        deque.add("Element 1");
        deque.addFirst("Element 0");
        deque.addLast("Element 2");
        deque.offer("Element 3");
        deque.offerFirst("Element -1");
        deque.offerLast("Element 4");

        // Displaying the Deque
        System.out.println("Deque: " + deque);

        // Removing elements from the Deque
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();

        // Displaying the removed elements
        System.out.println("Removed First: " + removedFirst);
        System.out.println("Removed Last: " + removedLast);

        // Displaying the updated Deque
        System.out.println("Updated Deque: " + deque);

        // Examining elements in the Deque
        String peekFirst = deque.peekFirst();
        String peekLast = deque.peekLast();

        // Displaying the peeked elements
        System.out.println("Peek First: " + peekFirst);
        System.out.println("Peek Last: " + peekLast);

        // Iterator for traversing elements
        System.out.print("Deque Elements (using iterator): ");
        for (String element : deque) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Iterator for traversing elements in reverse order
        System.out.print("Deque Elements (using descendingIterator): ");
        var descendingIterator = deque.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
        System.out.println();

        // Conversion to array
        String[] array = deque.toArray(new String[0]);
        System.out.print("Deque Elements (as array): ");
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

