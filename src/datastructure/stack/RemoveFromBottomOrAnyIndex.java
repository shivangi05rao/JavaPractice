package datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveFromBottomOrAnyIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        //Remove from bottom
        Stack<Integer> newStack = new Stack<>();
        while (st.size() > 1) {
            newStack.push(st.pop());
        }
        st.pop();
        while (!newStack.isEmpty()) {
            st.push(newStack.pop());
        }
        System.out.println(st);

        //Any index
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        while (st.size() > index) {
            newStack.push(st.pop());
        }
        st.pop();
        while (!newStack.isEmpty()) {
            st.push(newStack.pop());
        }
        System.out.println(st);
    }
}
