package datastructure.stack;

public class ArrayImplementationOfStack {
    public static class Stack{
        private final int[] arr = new int[5];
        private int idx = 0;

        void push(int x){
            if (isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop(){
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        int peek(){
            if (idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display(){
            for (int i = 0; i <= idx-1; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if (size() == 0){
                return true;
            } else {
                return false;
            }
        }

        boolean isFull(){
            if (idx == arr.length){
                return true;
            } else {
                return false;
            }
        }

        int capacity(){
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
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
        System.out.println(st.isFull());
        st.display();
        System.out.println(st.capacity());
    }
}
