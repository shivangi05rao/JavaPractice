package datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class PushAtBottomOrAtAnyIndex {
    public static void atBottomRecursively(Stack<Integer> stack, int element){
        if (!stack.isEmpty()){
            stack.push(element);
            System.out.println(stack);
            return;
        }
        int top = stack.pop();
        atBottomRecursively(stack, element);
        stack.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original stack: " + st);
        atBottomRecursively(st, 6);


        //At Bottom
        System.out.println("Enter element to end at the bottom: ");
        int ele = sc.nextInt();
        Stack<Integer> bottom = new Stack<>();
        while (!st.isEmpty()){
            bottom.push(st.pop());
        }

        st.push(ele);

        while (!bottom.isEmpty()){
            st.push(bottom.pop());
        }
        System.out.println("Added an element at the bottom of the stack: " + st);


        //At any index
        Stack<Integer> newStack = new Stack<>();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println("Enter the element: ");
        int x = sc.nextInt();
        while (st.size() > index){
            newStack.push(st.pop());
        }
        st.push(x);
        while (!newStack.isEmpty()){
            st.push(newStack.pop());
        }
        System.out.println("Added element at the " + index  + " index: " + st);
    }
}
