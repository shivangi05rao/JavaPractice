package backtracking;

public class Arranging {
    //TC O(n*n!)
    public static void printPermutation(String str, String prem, int idx){
        if (str.length() == 0){
            System.out.println(prem);
            return;
        }
        for (int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutation(newStr, prem + currChar, idx+1);
        }
    }

    public static void main(String[] args) {
        printPermutation("ABC", " ", 0);
    }
}
