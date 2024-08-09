package datastructure.stack.stackleetcode;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    static boolean balancedOrNot(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++){
            char ch = str.charAt(i);
            if (ch == '('){
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                if (st.peek() == '('){
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brackets: ");
        String str = sc .nextLine();
        System.out.println(balancedOrNot(str));
    }
}
