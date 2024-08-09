package arrays;

import java.util.Arrays;

public class CopyingArray {

    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 4;
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 9;
        arr[4] = 2;
        System.out.println("Original Array: ");
        printArray(arr);
        System.out.println();

        //trying to copy array
        //both array arr and arr_2 share same address that's why both th elements will be changed after changing one value "SHALLOW COPY"
        int[] arr_2 = arr;
            System.out.println("Copied Array: ");
            printArray(arr_2);
        System.out.println();

        //both the arrays arr and arr_3 have different address now known as Deep copying when cloning.
        int[] arr_3 = arr.clone();
        System.out.println("Cloned Array: ");
        printArray(arr_3);
        System.out.println();

//        arr_3 = Arrays.copyOf(arr, arr.length);
//        printArray(arr_3);

        //Using range of
        arr_3 = Arrays.copyOfRange(arr, 0, arr.length);
        printArray(arr_3);



        //changing some value in arr_3
        arr_3[0] = 0;
        arr_3[1] = 0;

        System.out.println("Original array after changing array 2");
        printArray(arr);

        System.out.println("Copied array after changing");
        printArray(arr_2);

        System.out.println("Cloning array: ");
        printArray(arr_3);



    }

}
