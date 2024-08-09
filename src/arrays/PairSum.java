package arrays;

import java.util.Scanner;

public class PairSum {

    static int findSecondSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) { //1 2 3 4 5
                secondMin = min; //
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
}
    static int lastRepeatingValue(int[] arr){
        int n = arr.length;
        int lastRepeatingNumber = -1;
        for (int i = 0; i < n ; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] == arr[j]){
                    lastRepeatingNumber = arr[i];
                }
            }
        }
        return lastRepeatingNumber;
    }

    static int firstRepeatingValue(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int findMaxVal(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondMax(int[] arr){
        int max = findMaxVal(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secMax = findMaxVal(arr);
        return secMax;
    }

    static int findUniqueElement(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }
    static int tripletSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if (arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    static int targetSum(int[] arr, int target){
        int ans = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                if (arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter target sum: ");
//        int target = sc.nextInt();
//
//        System.out.println(targetSum(arr, target));
//        System.out.println(tripletSum(arr, target));
//        System.out.println(findUniqueElement(arr));
//        System.out.println(findMaxVal(arr));
//        System.out.println(findSecondMax(arr));
//        System.out.println(firstRepeatingValue(arr));
//        System.out.println(lastRepeatingValue(arr));
        System.out.println(findSecondSmallest(arr));
    }
}
