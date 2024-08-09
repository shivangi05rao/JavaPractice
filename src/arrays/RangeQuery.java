package arrays;

import java.util.Scanner;

public class RangeQuery {

    static int findArraySum(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++){
            prefSum += arr[i];
        int suffixSum = totalSum - prefSum;
        if (prefSum == suffixSum) {
            return true;
            }
        }
        return false;
    }
    static int[] prefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    static int[] suffixSum(int[] arr){
        for (int i = arr.length-2; i >= 0; i--){
            arr[i] += arr[i+1];
        }
        return arr;
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        //For PrefixSum and Suffix sum

        System.out.print("Enter elements in the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int[] suffix = suffixSum(arr);
        printArray(suffix);


//        System.out.print("Enter elements in the array: ");
//        int[] arr = new int[n+1];
//        for (int i = 1; i <= n; i++){
//            arr[i] = sc.nextInt();
//        int[] pref = prefixSum(arr);
//
//        System.out.println("Enter number of queries: ");
//        int q = sc.nextInt();
//
//        while (q-- > 0){
//            System.out.println("Enter range: ");
//            int l = sc.nextInt();
//            int r = sc.nextInt();
//
//            int ans = pref[r] - pref[l-1];
//            System.out.println("Sum " + ans);
//        }

        //For Equal Sum

//        System.out.print("Enter elements in the array: ");
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Equal partition is possible: " + equalSumPartition(arr));

    }
}
