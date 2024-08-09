package datastructure.stack;

import java.util.Stack;

public class ReverseStack {
    //Using a recursive solution
    public static void reverseRecursively(Stack<Integer> stack) {
        if (stack.size() == 1) return;
        int top = stack.pop();
        reverseRecursively(stack);
        pushAtBottom(stack, top);
    }

    private static void pushAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, x);
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
        reverseRecursively(st);
        System.out.println(st);


        //Using iterative solution newStack
        Stack<Integer> stack = new Stack<>();
        while (!st.isEmpty()) {
            stack.push(st.pop());
        }
        System.out.println(stack);
    }
}
