package recursion;

public class StringInReverseUsingRecursion {
    //time complexity O(n)
    //print a string in reverse "abcd" --> "dcba"
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);
    }
    public static void printRev(String str, int idx){
        if (idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx-1);
    }
}
