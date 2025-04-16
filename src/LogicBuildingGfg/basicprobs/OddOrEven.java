package LogicBuildingGfg.basicprobs;

public class OddOrEven {
    static String oddEven(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(oddEven(2));
    }
}
