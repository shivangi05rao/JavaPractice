package datastructure.linkedlist.leetcodeproblems;

public class RemoveNthNodeFromEnd {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static Node removeNthNode(Node head, int index) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= index; i++) {
            fast = fast.next;
        }
        if (fast == null){
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(13);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(10);

        head = removeNthNode(head,6);
        print(head);
    }
}
