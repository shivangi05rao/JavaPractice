package LogicBuildingGfg.easyprobs;

public class PerfectNumber {
    //Naive approach
    static boolean perfectNum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    } //O(n) Time and O(1) Space

    static boolean isPerfect(long n) {
        long sum = 1;
        for (long i = 2; i * i <= n; i++) {
           if (n % i == 0) {
               if (i * i != n) {
                   sum += i + n/i;
               } else {
                   sum += i;
               }
           }
        }
        return sum == n && sum != 1;
    }//O(sqrt n) Time and O(1) Space

    public static void main(String[] args) {
        System.out.println(perfectNum(28));
        System.out.println(isPerfect(28));
    }
}
