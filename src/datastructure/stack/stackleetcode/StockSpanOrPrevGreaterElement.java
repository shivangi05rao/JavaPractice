package datastructure.stack.stackleetcode;

import java.util.Stack;

public class StockSpanOrPrevGreaterElement {
    private static int[] prevGreatestElementIndex(int[] price) {
        Stack<Integer> st = new Stack<>();
        int n = price.length;
        int[] res = new int[n];
        res[0] = 1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = i + 1;
            } else {
                res[i] = i - st.peek();
            }
            st.push(i);
        }
        return res;
    }

    private static int[] prevGreatestElementSecApproach(int[]  arr){
        return null;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85}; //1 1 1 2 1 4 6
        int[] stock = prevGreatestElementIndex(price);
        for (int stocks : stock) {
            System.out.print(stocks + " ");
        }
    }
}
