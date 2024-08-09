package datastructure.stack;

import java.util.Stack;

public class DisplayStack {
    public static void displayRecursively(Stack<Integer> stack){
        if (stack.isEmpty()) return;
        int top = stack.pop();
        displayRecursively(stack);
        System.out.print(top + " ");
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayRecursively(st);

        //using newStack
        Stack<Integer> newStack = new Stack<>();
        while (!st.isEmpty()){
            newStack.push(st.pop());
        }
        while (!newStack.isEmpty()){
            int x = newStack.pop();
            System.out.print(x + " ");
            st.push(x);
        }

        //Using array
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i = n-1; i >=0; i--){
//            arr[i] = st.pop();
//        }
//
//        for (int i=0; i < n; i++){
//            System.out.print(arr[i] + " ");
//            st.push(arr[i]);
//        }
    }
}
