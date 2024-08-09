package datastructure.linkedlist;

public class OperatingLinkedListRecursively {
    static  void printListRecursively(Node head){
        Node curr = head;
        if (curr == null) return;
        System.out.print(curr.val + " ");
        printListRecursively(curr.next);
    }

    static void reverseListNodeRecursively(Node head){
        Node curr =  head;
        if (curr == null) return;
        reverseListNodeRecursively(head.next);
        System.out.print(head.val + " ");
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(7);

        //for displaying a list recursively
        printListRecursively(head);
        System.out.println();

        //for reversing a list recursively
        reverseListNodeRecursively(head);

    }
}
