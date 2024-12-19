package InterviewCondingQuestions;

import java.util.Arrays;
//A string is good if there are no repeated characters.                     
//Given a string s , return the number of good substrings of length three in
//Note that if there are multiple occurrences of the same substring, every o
//A substring is a contiguous sequence of characters in a string.           
//                                                                          
//Example 1:                                                                
//Input: s = "xyzzaz"                                                       
//Output: 1                                                                 
//Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "z
//The only good substring of length 3 is "xyz".                             



public class PhonePeTest {
    public static void main(String[] args) {
        String s = "aababcabc";
        System.out.println(goodSubstrings(s));
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSumSubarrayOfSizeK(arr, k));
    }

    public static int goodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            if (unique(substring)) {
                count++;
            }
        }
        return count;
    }

    private static  boolean unique(String str) {
        return str.charAt(0) != str.charAt(1) &&
                str.charAt(1) != str.charAt(2) &&
                str.charAt(0) != str.charAt(2);
    }
    //Given an array of positive numbers and a positive number 'k,' find the max
//Example 1:
//Input: arr = [2, 1, 5, 1, 3, 2], k=3
//Output: 9
//Explanation: Subarray with maximum sum is [5, 1, 3].
    public static int maxSumSubarrayOfSizeK(int[] arr, int k) {
        if (arr.length < k) return -1;

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for (int end = k; end < arr.length; end++) {
            windowSum += arr[end] - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}




//RACE -- CARE                                                              
//                                                                          
//anagrams                                                                  
//                                                                          
//RACE - CAR                                                                
//                                                                          
//not -anagrams
class Test2 {
    public static void main(String[] args) {
        String str1 = "RACE";
        String str2 = "CARE";

        if (anagrams(str1, str2)) {
            System.out.println("are anagram");
        } else {
            System.out.println("not anagram");
        }

    }

    public static boolean anagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}                                                                           
                                                                            