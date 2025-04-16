package LogicBuildingGfg.easyprobs;

public class IsPower {
    static boolean isPow(int x, int y) {
        if (x == 1) {
            return y == 1;
        }
        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y) {
            pow *= x;
        }
        // Check if power of x becomes y
        return (pow == y);
    }

    public static void main(String[] args) {
        System.out.println(isPow(10, 1));
    }
}
