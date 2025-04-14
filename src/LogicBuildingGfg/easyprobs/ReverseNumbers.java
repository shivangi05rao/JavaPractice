package LogicBuildingGfg.easyprobs;

import stringbuilder.StringBui;

public class ReverseNumbers {
    //using loop
    static int reverse(int n) {
        int revNum = 0;
        while (n != 0) {
            revNum = revNum * 10 + n % 10;
            n /= 10;
        }
        return revNum;
    }

    // using string buffer
    static int reverseStringBuffer(int n) {
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();
        n = Integer.parseInt(String.valueOf(s));
        return n;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));
        System.out.println(reverseStringBuffer(987654321));
    }
}
