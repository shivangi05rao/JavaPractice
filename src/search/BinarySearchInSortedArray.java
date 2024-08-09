package search;

import java.util.Random;

public class BinarySearchInSortedArray {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[100000];
        for(int i=0;i<10000;i++){
            arr[i] = random.nextInt(20000);
        }
        System.out.println("Array Length: " + arr.length);
        int target = 4;
        long startTime = System.currentTimeMillis();
        linearSearch(arr, target);
        long stopTime = System.currentTimeMillis();
        System.out.println("Algorithm took -> " + (stopTime - startTime) + " milli seconds, or "
                + (stopTime - startTime) / 1000 + " seconds");
        System.out.println();


    }

    public static void linearSearch(int[] arr, int target){
        for (int i = 0; i<=arr.length ; i++){
            int curr = arr[i];
            if (curr == target){
                System.out.println("Target Present");
                return;
            }
        }
        System.out.println("Target not present");

    }


    private int binarySearch(int[] arr, int target, int left, int right){
        if (left < right){
            int mid = (left+right)/2;
            if (arr[mid] == target){
                return mid;
            }
            if (target < arr[mid]){
                return binarySearch(arr, target, left, mid-1);
            }
            return binarySearch(arr, target, mid+1, right);
        }
        return -1;
    }
}
