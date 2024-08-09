package datastructure.linkedlist;

public class ImplementationOfLinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);

        ll.insertAtBeginning(1);
        ll.insertAtBeginning(5);
        ll.insertAtBeginning(3);

        ll.display();
        System.out.println();

        int size = ll.size();
        System.out.println("Length of the Linked List: " + size);

        boolean contains = ll.contains(7);
        System.out.println("Is present: " + contains);

        ll.insertAtIndex(2, 18);
        ll.insertAtIndex(4,12);
        ll.insertAtIndex(0, 34);
        ll.insertAtIndex(9, 10);
        ll.display();
        System.out.println();

        int getElement = ll.getAt(0);
        System.out.println("The element at index: " + getElement);

        ll.display();
        System.out.println();
        ll.deleteAt(0);
        ll.display();

    }
}