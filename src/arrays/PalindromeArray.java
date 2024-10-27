package arrays;

public class PalindromeArray {
    public static void checkAndPrintPalindrome(int[] arr){
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length-1-i]){
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome){
            System.out.println("The array is Palindrome.");
        } else {
            System.out.println("The array is NOT Palindrome");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 21, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        checkAndPrintPalindrome(arr1);
        checkAndPrintPalindrome(arr2);
    }
}
