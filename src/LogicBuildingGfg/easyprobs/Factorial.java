package LogicBuildingGfg.easyprobs;

public class Factorial {
    static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }

    //recursive solution
    static int factRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factRecursive(n -1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factRecursive(5));
    }
}
