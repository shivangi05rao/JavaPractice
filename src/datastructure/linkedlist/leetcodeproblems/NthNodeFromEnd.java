package datastructure.linkedlist.leetcodeproblems;

public class NthNodeFromEnd {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    //Finding the nth node form end using count size and size = count-n+1
    public static Node nthNode(Node head, int nodeIndex) {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        int size = count - nodeIndex + 1;
        //mth node from start
        curr = head;
        for (int i = 1; i <= size - 1; i++) {
            curr = curr.next;
        }
        return curr;
    }

    //Finding nth node from the end in one traversal
    public static Node nthNodeFromEndInOneTraversal(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    public static void main(String[] args) {
        Node head = new Node(100);
        head.next = new Node(13);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(10);

        Node curr = nthNode(head, 3);
        System.out.println(curr.val);

        Node nNOde = nthNodeFromEndInOneTraversal(head, 2);
        System.out.println(nNOde.val);

    }
}
