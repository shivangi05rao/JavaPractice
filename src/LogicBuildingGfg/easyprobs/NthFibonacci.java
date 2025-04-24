package LogicBuildingGfg.easyprobs;

import java.util.Arrays;

public class NthFibonacci {
    //Naive approach
    static int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    } //Time Complexity: O(2n), Auxiliary Space: O(n), due to recursion stack

    //[Expected Approach-1] Memoization Approach
    static int nthFibonacci2(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != -1) return memo[n];

        memo[n] = nthFibonacci2(n - 1, memo) + nthFibonacci2(n - 2, memo);
        return memo[n];
    }

    static int nthFibonacciUtil(int n) {

        // Create a memoization table and initialize with -1
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        // Call the utility function
        return nthFibonacci2(n, memo);
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(5));
        System.out.println(nthFibonacciUtil(5));
;    }
}
