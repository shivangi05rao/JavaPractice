package datastructure.stack;

import java.util.Stack;

public class CopyStackInSameOrder {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements you want to insert: ");
//        int n = sc.nextInt()    ;
//        System.out.println("Enter the elements: ");
//        for (int i = 0; i <= n; i++){
//            int x = sc.nextInt();
//            st.push(x);
//        }
//        System.out.println(st);
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        //Reverse order
        Stack<Integer> rvSt = new Stack<>();
        while (st.size() > 0){
//            int x = st.peek();
//            rvSt.push(x);
//            st.pop();
            rvSt.push(st.pop());
        }
        System.out.println("Reverse of stack: " + rvSt);

        //Same order
        Stack<Integer> sSt = new Stack<>();
        while (rvSt.size() > 0) {
            sSt.push(rvSt.pop());
        }
        System.out.println("Same order of stack: " + sSt);

    }
}
