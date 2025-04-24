package LogicBuildingGfg.meduimProblems;

import java.util.Arrays;

public class ThreeDivisors {
    //Naive Approach
    static int count(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    static void numbersWithThreeDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (count(i) == 3) {
                System.out.println(i + " ");
            }
        }
    } //Time Complexity: O(n2), Space Complexity: O(1)

    //Expected approach 1 - Mathematical Approach
    //The number having exactly 3 divisors must be a perfect square of a prime number.
    static void numbersWithThreeDivisors2(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p)  {
                    prime[i] = false;
                }
            }
        }

        System.out.println("Numbers with 3 divisors: ");
        for (int i = 0; i * i <= n; i++) {
            if (prime[i]){
                System.out.println(i * i + " ");
            }
        }
    }

    //[Expected Approach-2] Using Constant Space
    static void numbersWithThreeDivisors3(int n) {
        System.out.println("Numbers with 3 divisors: ");
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i))
                System.out.println(i * i + " ");
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        numbersWithThreeDivisors(100);
        numbersWithThreeDivisors2(100);
        numbersWithThreeDivisors3(100);
    }
}
