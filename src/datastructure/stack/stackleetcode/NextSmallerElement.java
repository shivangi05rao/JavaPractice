package datastructure.stack.stackleetcode;

import java.util.Stack;

public class NextSmallerElement {
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
        Stack<Integer>  st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        st.push(0);
        for (int i = 1; i < n; i++){
            res[i] = -1;
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]){
                res[st.pop()] = arr[i]; //for the value
            }
            st.push(i);
        }
        return  res;
    }

    private static int[] smallerIndex(int[] arr) {
        Stack<Integer>  st = new Stack<>();
        int n = arr.length;
        int[] idx = new int[n];
        st.push(0);
        for (int i = 1; i < n; i++){
            idx[i] = -1;
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]){
                idx[st.pop()] = i; //for the index
            }
            st.push(i);
        }
        return  idx;
    }
}
