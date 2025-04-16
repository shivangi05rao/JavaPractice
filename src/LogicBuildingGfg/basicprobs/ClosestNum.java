package LogicBuildingGfg.basicprobs;

public class ClosestNum {
    static int closest(int n, int m) {
        int q = n / m;
        int n1 = m * q;
        int n2 = (n * m) > 0 ? m * (q + 1) : m * (q - 1);
        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        System.out.println(closest(13, 4));
    }
}
