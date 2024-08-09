package datastructure.linkedlist;

public class LinkedList {
    Node head;
    //Node tail;

     static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void insertAtIndex(int index, int val) {
        Node newNode = new Node(val);
        Node curr = head;
        if (index == size()){
            insertAtEnd(val);
            return;
        } else if (index == 0){
            insertAtBeginning(val);
            return;
        } else if (index < 0 || index > size()){
            System.out.println("Index out of bounds");
            return;
        }

        for (int i = 1; i <= index-1; i++){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

        public int getAt(int index){
            Node curr = head;
            if (index < 0 || index > size()){
                System.out.println("Index out of bound");
                return -1;
            }

            for (int i = 1; i <= index; i++){
                curr = curr.next;
            }
            return (curr.val);
        }

    public void deleteAt(int index){
        if (head == null)
            return;
        Node curr = head;
        if (index == 0)
        {
            head = curr.next;
            return;
        }
        for (int i=0; curr!=null && i<index-1; i++)
            curr = curr.next;
        if (curr == null || curr.next == null)
            return;
        curr.next = curr.next.next;
    }


    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public int size() {
        Node curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public boolean contains(int target) {
        Node curr = head;
        while (curr != null) {
            if (curr.val == target) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}
