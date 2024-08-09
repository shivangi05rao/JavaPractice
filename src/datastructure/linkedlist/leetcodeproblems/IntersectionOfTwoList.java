package datastructure.linkedlist.leetcodeproblems;

public class IntersectionOfTwoList {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node intersectionNode(Node head1, Node head2){
        Node curr1 = head1;
        Node curr2 = head2;

        int count1 = 0;
        while (curr1 != null) {
            count1++;
            curr1 = curr1.next;
        }

        int count2 = 0;
        while (curr2 != null) {
            count2++;
            curr2 = curr2.next;
        }

        curr1 = head1;
        curr2 = head2;

        if (count1 > count2) {
            int steps = count1 - count2;
            for (int i = 0; i < steps; i++) {
                curr1 = curr1.next;
            }
        } else {
            int steps = count2 - count1;
            for (int i = 0; i < steps; i++) {
                curr2 = curr2.next;
            }
        }

        while (curr1 != null && curr2 != null && curr1 != curr2) {
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        return curr1;
    }

    public static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head1 = new Node(87);
        head1.next = new Node(100);
        head1.next.next = new Node(13);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(12);
        head1.next.next.next.next.next.next = new Node(10);

        Node head2 = new Node(90);
        head2.next = new Node(9);
        head2.next.next = head1.next.next.next.next;
        head2.next.next.next = new Node(12);
        head2.next.next.next.next = new Node(10);

        print(head1);
        print(head2);

        Node intersectionNode = intersectionNode(head1, head2);
        if (intersectionNode != null) {
            System.out.println("Intersection found at value: " + intersectionNode.val);
        } else {
            System.out.println("No intersection found");
        }
    }
}
