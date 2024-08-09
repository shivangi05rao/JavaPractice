package datastructure.stack.stackleetcode;

import java.util.Stack;

public class NextGreaterElement {
    public static int[] greaterEleUsingStack(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        //stack solution
        int[] res = new int[n];
        res[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static int[] nextGreaterElementSecApproach(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        st.push(0);
        for (int i = 1; i < n; i++){
            res[i] = -1;
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                res[st.pop()] = arr[i];
            }
            st.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        //The array solution increases the time complexity, so we do not use an array we will use stacks here
        int[] arr = {1, 5 ,3, 2, 1, 6, 3, 4};
        //array solution
        //int[] res = greaterEleUsingStack(arr);
        int[] res = nextGreaterElementSecApproach(arr);
//        for (int i = 0; i < arr.length; i++){
//            res[i] = -1;
//            for (int j = i+1; j < arr.length; j++){
//                if (arr[j] > arr[i]){
//                    res[i] = arr[j];
//                    break;
//                } else {
//                    res[i] = -1;
//                }
//            }
//        }
//        for (int ar : arr) {
//            System.out.print(ar + " ");
//        }
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
