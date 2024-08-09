package educative.array;

public class ArrayToMethod {

    static int[] multiply(int[] arr, int num){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * num;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Values before multiplying.");
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int[] returnedArr = multiply(arr, 3);
        System.out.println("Values after multiplying.");
        for (int i = 0; i< returnedArr.length; i++){
            System.out.print(returnedArr[i] + " ");
        }
    }
}
