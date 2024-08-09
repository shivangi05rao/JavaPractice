package leetcode.leetcode75;

public class ReverseVowelsOfString {
    public static String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int n = s.length();
        int l = 0;
        int r = n - 1;

        while (l < r) {
            char left = word[l];
            char right = word[r];

            if (!isVowel(left) && !isVowel(right)) {
                l++;
                r--;
            } else if (isVowel(left) && isVowel(right)) {
                swap(word, l, r);
                l++;
                r--;
            } else {
                if (!isVowel(left)) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return String.valueOf(word);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        String s = "hello";
        String str = reverseVowels(s);
        System.out.println(str);
    }
}
