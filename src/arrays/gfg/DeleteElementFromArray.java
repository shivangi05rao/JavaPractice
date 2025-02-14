package arrays.gfg;

import java.util.Arrays;

public class DeleteElementFromArray {
    public static int findElement(int[] arr, int element) {
        for (int i = 0; i <  arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int delete(int[] arr, int element) {
        int idx = findElement(arr, element);
        if (idx == -1) {
            System.out.println("Element not found!");
            return element;
        }

        for (int i = idx; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return arr.length - 1;
    }

    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5, 6};
        System.out.println("Before deletion: " + Arrays.toString(arr));

        int n = delete(arr, 3);

        System.out.println("After deletion: " + Arrays.toString(Arrays.copyOf(arr, n)));
    }
}
