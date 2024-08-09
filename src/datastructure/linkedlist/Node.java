package datastructure.linkedlist;

public class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static boolean contains(Node head, int target) {
        Node curr = head;
        while (curr != null){
            if (curr.val == target){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    static int lengthOfListNode(Node head) {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    static Node reverseListNode(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    static void append(Node head, int val) {
        Node newNode = new Node(val); //5 3
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(7);

        //displaying
        printList(head);


        //Checking if an element is present
        boolean isPresent = contains(head,4);
        System.out.println(isPresent);

        //Checking the number of elements
        int numberOfElements = lengthOfListNode(head);
        System.out.println(numberOfElements);

        //Adding elements at the end of the linked list
         append(head, 8);
        printList(head);

        append(head, 19);
        printList(head);

        //Reversing the list
        head = Node.reverseListNode(head);
        Node.printList(head);

    }
}
