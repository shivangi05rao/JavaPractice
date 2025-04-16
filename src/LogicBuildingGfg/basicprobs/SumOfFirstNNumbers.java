package LogicBuildingGfg.basicprobs;

public class SumOfFirstNNumbers {
    //naive approach
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }

    //formula approach
    static int sumNum(int n) {
        return n * (n + 1) / 2;
    }

    //Note: The above program causes overflow,
    // even if the result is not beyond the integer limit. We can avoid overflow up to some extent by dividing first.
    static int sumNumAvoidOverflow(int n) {
        if (n % 2 == 0) {
            return (n / 2) * (n + 1);
        } else {
            return ((n + 1) / 2) * n;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(sumNum(5));
        System.out.println(sumNumAvoidOverflow(5));
    }
}
