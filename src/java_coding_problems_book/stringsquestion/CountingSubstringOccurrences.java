package java_coding_problems_book.stringsquestion;

public class CountingSubstringOccurrences {

    public static int countSubstringOccurrences(String mainString,  String substringToCount){
        int count = 0;
        int index = mainString.indexOf(substringToCount);

        while (index != -1){
            count++;
            index = mainString.indexOf(substringToCount, index+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int res = countSubstringOccurrences("Java is a powerful programming language." +
                " Java is widely used in the industry.", "Java");

        System.out.println("Occurrences of: " + res);
    }
}
