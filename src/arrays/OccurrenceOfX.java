package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class OccurrenceOfX {

    static int[] kthSmallestAndLargestElement(int[] arr, int k){
        Arrays.sort(arr);
        int[] ans1 = {arr[k-1], arr[arr.length-k]};
        return ans1;
    }
    static int[] smallestAndLargestElement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    static boolean isSortedOrNot(int[] arr){
        boolean check = true;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    static int strictlyGreater(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > x){
                count++;
            }
        }
        return count;
    }

    static int lastOccurrence(int[] arr, int x){
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static int ElementOccur(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kth value: ");
        int k = sc.nextInt();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
//        int count = 0;
//
        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
//
//
        int[] arr = new int[n];
        System.out.println("Enter Elements of array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Number of times element occurred: "+ ElementOccur(arr, x));
        System.out.println("Last index when the element occurred: " + lastOccurrence(arr, x));
        System.out.println("Number of elements strictly greater than x: " + strictlyGreater(arr, x));
        System.out.println("Array is sorted: " + isSortedOrNot(arr));
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest Element: " + ans[0]);
        System.out.println("Largest Element: " + ans[1]);

        int[] ans1 = kthSmallestAndLargestElement(arr, k);
        System.out.println(k + "th Smallest element: " + ans1[0]);
        System.out.println(+ k + "th Largest element: " + ans1[1]);


///        for (int i = 0; i < n; i++){
//            if (arr[i] == x){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
