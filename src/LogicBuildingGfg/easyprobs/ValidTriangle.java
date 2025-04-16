package LogicBuildingGfg.easyprobs;

public class ValidTriangle {
    static boolean valid(int a, int b, int c) {
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            return false;
        } else return true;
    }

    public static void main(String[] args) {
        System.out.println(valid(7, 10, 5));
    }
}
