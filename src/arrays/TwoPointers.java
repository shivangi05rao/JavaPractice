package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers {

    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int j = 0;
        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[j++] = arr[left] * arr[left];
                left++;
            } else {
                ans[j++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    static void sortEvenOrOdd(int[] arr){
        int n = arr.length;

        for (int left = 0, right = n - 1; left <= right; left++, right--){
            if (arr[left]%2 == 1 && arr[right]%2 == 0){
                swap(arr, left, right);
            }

            if (arr[left]%2 == 0){
                left++;
            }

            if (arr[right]%2 == 1){
                right--;
            }
        }
    }
    static void sortZerosAndOnesInPlace(int[] arr){
        int n = arr.length;

        int left = 0, right = arr.length - 1;
        while (left < right){
            if (arr[left] == 1 && right == 1){
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] == 0){
                left++;
            }

            if (arr[right] == 1){
                right--;
            }
        }
    }

    static void sortZerosAndOnes(int[] arr){
        int zeros = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                zeros++;
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (i < zeros){
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

    }

    static void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Original array: ");
//        printArray(arr);
//        System.out.println("Sorted array: ");
//        sortZerosAndOnes(arr);
//        printArray(arr);
//
//        System.out.println("Original array: ");
//        printArray(arr);
//        System.out.println("Sorted array: ");
//        sortZerosAndOnesInPlace(arr);
//        printArray(arr);

        System.out.println("Original array: ");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.println("Sorted array: ");
        //sortEvenOrOdd(arr);
        //printArray(arr);
        //reverse(ans);
        Arrays.sort(ans);

        printArray(ans);

    }
}
