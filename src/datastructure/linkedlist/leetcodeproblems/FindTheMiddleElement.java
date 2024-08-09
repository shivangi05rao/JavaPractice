package datastructure.linkedlist.leetcodeproblems;

public class FindTheMiddleElement {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static Node middleElement(Node head){
        Node slow = head;
        Node fast = head;
        //Using size method
//        if (size(head)%2 == 0) {
//            //for left middle
////            while (fast.next.next != null) {
////                slow = slow.next;
////                fast = fast.next.next;
////            }
//            //for right middle
//            while (fast != null){
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//        } else {
//            while (fast.next != null){
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//        }
//        return slow;
//    }

//    public static int size(Node head){
//        Node curr = head;
//        int count = 0;
//        while (curr != null) {
//            count++;
//            curr = curr.next;
//        }
//        return count;

        //Without using size method
        if (head == null || head.next == null)
            return head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast.next != null){
            return slow.next;
        } else {
            return slow;
        }
   }

    public static void main(String[] args) {
//        Node head = new Node(100);
//        head.next = new Node(13);
//        head.next.next = new Node(4);
//        head.next.next.next = new Node(5);
//        head.next.next.next.next = new Node(12);
//        head.next.next.next.next.next = new Node(10);
//        head.next.next.next.next.next.next = new Node(16);

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        //head.next.next.next.next.next.next = new Node(16);

        //int size = size(head);
        //System.out.println(size);

        head = middleElement(head);
        System.out.println("Mid element of the linked list is: " + head.val);


    }
}
