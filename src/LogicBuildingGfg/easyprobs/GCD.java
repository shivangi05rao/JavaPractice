package LogicBuildingGfg.easyprobs;

public class GCD {
    static int gcdBestSol(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }//Time Complexity: O(log(min(a, b))), Space Complexity: O(1)

    static int gcdRecursiveSol(int a, int b) {
        if (a == 0) return b;
        return gcdRecursiveSol(b % a, a);
    } // Time Complexity: O(log min(n1,n2)) Space Complexity: O(log min(n1,n2)) due to recursion stack.

    static int gcd(int a, int b) {
        int res = Math.min(a, b);
        while (res > 0) {
            if (a % res == 0  && b % res == 0){
                break;
            }
            res--;
        }
        return res;
    } //Time Complexity: O(min(a,b)) , Auxiliary Space: O(1)

    //Euclidean Algorithm – Subtraction
    static int gcdEuclidean(int a, int b) {
        if (a == 0) return b;
        if (b == 0)  return a;
        if (a == b) return a;
        if (a > b) {
            return gcdEuclidean(a-b, b);
        } else {
            return gcdEuclidean(a, b -a);
        }//Time Complexity: O(min(a,b)) Auxiliary Space: O(min(a,b))
        // because it uses internal stack data structure in recursion.
    }

    //Optimized Subtraction Euclidean by Checking Divisibility First
    static int gcdEuclideanDivisible(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        if (a > b) {
            if (a % b == 0) return b;
            return gcdEuclideanDivisible(a - b, b);
        } else {
            if (b % a == 0) return a;
            return gcdEuclideanDivisible(a, b - a);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(20, 28));
        System.out.println(gcdEuclidean(20, 28));
        System.out.println(gcdEuclideanDivisible(20, 28));
        System.out.println(gcdBestSol(96, 54));
        System.out.println(gcdRecursiveSol(12, 15));
    }
}
