package LogicBuildingGfg.easyprobs;

public class SumOfNumbers {
    //iterative way
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last;
            n /= 10;
        }
        return sum;
    }

    //recursive way
    static int recurSumOfDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + recurSumOfDigits(n/10);
    }

    //Taking Input Number as String
    static int inputAsString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            int digit = s.charAt(i) - '0';
            sum = sum + digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
        System.out.println(recurSumOfDigits(12345));
        System.out.println(inputAsString("123456789123456789123422"));
    }
}
