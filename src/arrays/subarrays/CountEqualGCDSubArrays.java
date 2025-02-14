package arrays.subarrays;

public class CountEqualGCDSubArrays {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = 0;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int countWaysToSplit(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        int leftGCD = 0, rightGCD = 0, count = 0;

        for (int num : arr) {
            leftGCD = gcd(leftGCD, num);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            rightGCD = gcd(rightGCD, arr[i]);
            if (leftGCD == rightGCD) {
                count++;
            }
            leftGCD = gcd(leftGCD, arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int res = countWaysToSplit(new int[]{8, 4, 4, 8, 12});
        System.out.println(res);
    }
}
