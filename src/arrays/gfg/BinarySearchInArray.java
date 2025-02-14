package arrays.gfg;

public class BinarySearchInArray {
    //find x in the array using binary search
    private static int search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int res = search(new int[]{2, 3, 4, 7, 7, 55, 99}, 7);
        System.out.println(res);
    }
}
