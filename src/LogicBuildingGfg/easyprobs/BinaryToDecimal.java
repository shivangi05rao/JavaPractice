package LogicBuildingGfg.easyprobs;

public class BinaryToDecimal {
    //[Approach – 1] Division by 2 – O(log n) Time and O(1) Space
    static String binToDec(int n) {
        StringBuilder s = new StringBuilder();
        while (n > 0) {
            int bit = n % 2;
            s.append((char) ('0' + bit));
            n /= 2;
        }
        s.reverse();
        return s.toString();
    }

    //Built-in Method
    static String binToDecimal(int n) {
        int len = (int)(Math.log(n) / Math.log(2));

        // Convert to binary string and remove leading zeros
        return String.format("%s", Integer.toBinaryString(n));
    }

    public static void main(String[] args) {
        System.out.println(binToDec(12));
        System.out.println(binToDecimal(12));
    }
}
