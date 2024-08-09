package java_coding_problems_book.stringsquestion;

public class ReverseLettersAndWords {
    public static void main(String[] args) {

        //Approach - 1
        String input = "java code";
        System.out.println("Original string: " + input);

        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reverseWord = new StringBuilder();
            //reverse word
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord.append(word.charAt(j));
            }
            output.append(reverseWord).append(" ");
        }
        System.out.println(output);
    }
}
