package leetcode.leetcode75;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOnes(int[] digits){
        for (int i = digits.length-1; i >= 0; i--){
            if (digits[i] == 9){
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        int[] digit1 = {9, 9, 9};
        int[] digit2 = {1, 2, 3};

        int[] d1= plusOnes(digit1);
        System.out.println(Arrays.toString(d1));
        int[] d2 = plusOnes(digit2);
        System.out.println(Arrays.toString(d2));
    }
}
