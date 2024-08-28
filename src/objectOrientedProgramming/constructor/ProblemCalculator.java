package objectOrientedProgramming.constructor;

class ProblemCalculator {
    private final double num1;
    private final double num2;

    public ProblemCalculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    double add() {
        return num1 + num2;
    }

    double subtract() {
        return num2 - num1;
    }

    double multiply() {
        return num1 * num2;
    }

    double divide() {
        if (num1 != 0) {
            return num2 / num1;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

}

class Demo {

    public static void main(String[] args) {
        ProblemCalculator obj = new ProblemCalculator(10, 94);

        System.out.println(obj.add());
        System.out.println(obj.subtract());
        System.out.println(obj.multiply());
        System.out.println(obj.divide());
    }

}