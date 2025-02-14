package arrays.gfg;

public class InsertAtIndex {
    public static void insert(int[] arr, int numOfElements, int atIndex, int element) {
        for (int i = numOfElements - 1; i >= atIndex; i--) {
            arr[i + 1] = arr[i];
        }
        arr[atIndex] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;

        insert(arr, 4, 2, 3);
    }
}
