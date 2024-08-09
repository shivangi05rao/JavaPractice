package datastructure.stack.stackleetcode;

import java.util.Stack;

public class PrevSmallerElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 5};
        int[] res = smallerElement(arr);
        int[] idx = smallerIndex(arr);
        System.out.println("The next smaller elements: " );
        for (int re : res){
            System.out.print(re + " ");
        }
        System.out.println();
        System.out.println("The next smaller index: ");
        for (int idc : idx){
            System.out.print(idc + " ");
        }
    }

    private static int[] smallerElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            if (!st.isEmpty()){
                res[i] = arr[st.peek()];
            } else {
                res[i] = -1;
            }
            st.push(i);
        }
        return res;
    }
    private static int[] smallerIndex(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] idx = new int[n];
        for (int i = 0; i < n; i++){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i] ){
                st.pop();
            }
            if (!st.isEmpty()){
                idx[i] = st.peek();
            } else {
                idx[i] = -1;
            }
            st.push(i);
        }
        return idx;
    }
}
