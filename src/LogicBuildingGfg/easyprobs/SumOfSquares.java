package LogicBuildingGfg.easyprobs;

public class SumOfSquares {
    //Using naive approach
    static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        return sum;
    } //O(n) Time and O(1) Space

    //Using Math formula
    static int mathSummation(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }  //O(1) Time and O(1) Space

    //In the above method, sometimes due to large value of n, the value of (n * (n + 1) * (2 * n + 1))
    // would overflow. We can avoid this overflow up to some extent using
    // the fact that n*(n+1) must be divisible by 2 and restructuring
    // the formula as (n * (n + 1) / 2) * (2 * n + 1) / 3;

    static int summationAvoidOverflow(int n) {
        return (n * (n + 1) / 2) * (2 * n + 1) / 3;
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println(summation(8));
        System.out.println(mathSummation(3));
        System.out.println(summationAvoidOverflow(3));
    }
}
