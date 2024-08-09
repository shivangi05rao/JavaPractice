package datastructure.stack;

public class LinkedListImplementationOfStack {
    public static class Node { //User defined data type
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static class LLStack { //user defined data structure
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node curr = new Node(x);
            curr.next = head;
            head = curr;
            size++;
        }

        int pop() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int curr = head.val;
            head = head.next;
            return curr;
        }

        int peek() {
            if (head == null) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }

        void displayRec(Node h) {
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val + " ");
        }

        void display() {
            displayRec(head);
            System.out.println();
        }

        void displayRev() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.val + " ");
                curr = curr.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            return size == 0;
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.peek();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        System.out.println(st.isEmpty());
        st.push(2);
        st.push(3);
        st.push(7);
        st.push(4);
        st.display();
        st.displayRev();
    }

    //Stack is empty
    //5 4 1
    //1
    //3
    //5 4
    //false
    //true
    //5 4 2 3 7
}
