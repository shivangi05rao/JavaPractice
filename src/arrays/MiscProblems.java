package arrays;

public class MiscProblems {

    static void swapWithMaths(int a, int b){
        System.out.println("Original values before swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static void swap(int a, int b){
        System.out.println("Original values before swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];

        //using for loop
        int j = 0;

        //traverse original array in reverse direction
        for (int i = n-1; i >= 0; i--){
            ans[j++] = arr[i];
        }

        //using while loop
//        int i = n-1, j = 0;
//        while (i >= 0){
//            ans[j++] = arr[i--];
//        }

        return ans;
    }

    static void swapInArray(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;

    }
    static void reverseArrayInPlace(int[] arr){
        //using for loop
        for (int i = 0, j = arr.length-1; i < j; i++, j--){
            swapInArray(arr, i, j);
        }

        //using while loop
        int i = 0, j = arr.length-1;
        while (i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1, 2, 3, 4, 5};
        swap(a, b);
        swapWithMaths(a, b);
        int[] ans = reverseArray(arr);
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        printArray(ans);
        reverseArrayInPlace(arr);
        printArray(arr);

    }
}
