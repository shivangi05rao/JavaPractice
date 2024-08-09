package arrays;

import java.util.Scanner;

public class PrefixSum {

    //Without creating new array
    static int[] prefixSumInPlace(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    //By creating new Array
    static int[] printPrefixSum(int[] arr){
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Input Array: ");
        printArray(arr);

        System.out.println("Prefix sum of the given array: ");
        int[] pref = printPrefixSum(arr);
        printArray(pref);

        System.out.println("Prefix sum of the given array without creating new array: ");
        int[] ans = prefixSumInPlace(arr);
        printArray(ans);
    }
}
