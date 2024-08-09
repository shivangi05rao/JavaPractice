package datastructure.stack;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);

        //to know the first element
        while (st.size() > 1){
            st.pop();
        }
        System.out.println(st.peek());

        //to pop all the elements
        while (!st.isEmpty()){
            st.pop();
        }
        System.out.println(st);
    }
}
