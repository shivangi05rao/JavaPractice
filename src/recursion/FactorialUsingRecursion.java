package recursion;

public class FactorialUsingRecursion {
    public static int calcFactorial(int n){
        //base case
        if (n == 1 || n == 0){
            return 1;
        }

        int fact = calcFactorial(n-1);
        int fact1 = n * fact;
        return fact1;
    }

    public static void main(String[] args) {
        int n = 5;
        int res = calcFactorial(n);
        System.out.println(res);
    }
}
