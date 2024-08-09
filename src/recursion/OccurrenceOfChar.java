package recursion;

public class OccurrenceOfChar {
    //Find the first and last occurrence of String
    //Time Complexity O(n)
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        charOccurrence(str, 0, 'a');
    }
    public static int first = -1;
    public static int last = -1;
    public static void charOccurrence(String str, int idx, char element){
        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element){
            if (first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        charOccurrence(str, idx+1, element);
    }
}
