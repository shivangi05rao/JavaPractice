package recursion;

public class CheckIfArrayIsSortedUsingRecursion {
    //TC O(n)
    //Strictly increasing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arrayIsSorted(arr, 0));
    }
        public static boolean arrayIsSorted(int[] arr, int idx) {
            if (idx == arr.length - 1) {
                return true;
            }
            if (arr[idx] < arr[idx + 1]) {
                //array is sorted
                return arrayIsSorted(arr, idx + 1);
            } else {
                return false;
            }
        }
}
