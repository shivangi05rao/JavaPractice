package LogicBuildingGfg.easyprobs;

public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //optimized
    static boolean isPrimeOpt(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) {
        System.out.println(isPrime(4));
        System.out.println(isPrimeOpt(11));
    }
}
