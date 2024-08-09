package datastructure.stack.stackleetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;
                char ch = st.peek();
                if (ch == '(' && c == ')' || ch == '{' && c == '}' || ch == '[' && c == ']'){
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input bracket: "); //{}[]() //{}[](]
        String str = sc.nextLine();
        System.out.println(isValid(str));
    }
}
