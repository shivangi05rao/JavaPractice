package arrays.gfg;

public class FirstOccurrenceUsingBinarySearch {
    private static int firstOccurrence(int[] arr, int x) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <=  right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = firstOccurrence(new int[] {2, 2, 2, 3, 4, 7, 7, 7, 55, 99}, 7);
        System.out.println(result);
    }
}


