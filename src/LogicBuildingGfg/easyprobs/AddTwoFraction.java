package LogicBuildingGfg.easyprobs;

import java.util.ArrayList;

public class AddTwoFraction {
    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    static ArrayList<Integer> addFraction(int a, int b, int c, int d) {
        ArrayList<Integer> list = new ArrayList<>();
        int gcd = gcd(b, d);
        int lcm = (b * d) /gcd;

        int sameDenoNum1 = a * (lcm / b);
        int sameDenoNum2 = c * (lcm / d);

        int sum = sameDenoNum1 + sameDenoNum2;

        int simplify = gcd(sum, lcm);
        sum /= simplify;
        lcm /= simplify;
        list.add(sum);
        list.add(lcm);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(addFraction(1, 3, 3, 9));
    }
}
