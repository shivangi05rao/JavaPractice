package LogicBuildingGfg.easyprobs;

public class NthTermOfSeries {
    //Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21…
    //Naive
    static int term(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        return ans;
    }

    //[Expected Approach] Using Formula – O(1) time and O(1) space
    static int term1(int n) {
        return n * (n + 1) /2;
    }

    public static void main(String[] args) {
        System.out.println(term(3));
        System.out.println(term1(3));
    }
}
