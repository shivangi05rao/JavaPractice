package junit;


public class LaunchCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result = calc.divide(10,5);
        if (result == 2){
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }
        int result2 = calc.multiply(10,0);
        if (result2 == 0){
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }
    }
}
