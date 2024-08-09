package arrays;

import java.util.Scanner;

public class RotatingArray {

    static void swapNumInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int i, int j){
        while (i < j){
           swapNumInArray(arr, i, j);
            i++;
            j--;
        }
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //rotating array without extra space
    static void rotateInPlace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0,n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

    }

    //rotate the array kth time
    static int[] rotateUsingSpace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        System.out.println("Original array: ");
        printArray(arr);
//        int[] ans = rotateUsingSpace(arr,k);
//        System.out.println("Array after rotation: ");
//        printArray(ans);

        rotateInPlace(arr, k);
        System.out.println("Array after rotation: ");
        printArray(arr);


    }
}
