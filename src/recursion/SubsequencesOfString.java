package recursion;

public class SubsequencesOfString {
    //Important Question
    //TC O(2^n)
    //Print all subsequences of a string
    public static void main(String[] args) {
        subsequences("abc", 0, " ");
    }
    public  static void subsequences(String str, int idx, String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be in string
        subsequences(str, idx+1, newString+currChar);
        //not to be in the string
        subsequences(str, idx+1, newString);
    }
}
