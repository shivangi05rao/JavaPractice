package arrays.subarrays;

public class TwoEqualSumSubarray {
    public static int findSplitPoint(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (totalSum % 2 != 0) {
            return -1;
        }

        int leftSum = 0;
        int targetSum = totalSum / 2;

        for (int i = 0; i < arr.length - 1; i++) {
            leftSum += arr[i];

            if (leftSum == targetSum) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void printTwoParts(int[] arr) {
        int splitPoint = findSplitPoint(arr);

        if (splitPoint == -1) {
            System.out.println("Not possible");
            return;
        }

        System.out.println("First Part: ");
        for (int i = 0; i < splitPoint; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Second Part: ");
        for (int i = splitPoint; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printTwoParts(new int[] {1, 2, 3, 4, 5, 5});
    }
}
