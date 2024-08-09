package java_coding_problems_book.stringsquestion;

public class CountingOccurrencesOfSameCharacter {

    //Approach - 1
    public static int countOccur(String input, char targetChar){
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == targetChar){
                count++;
            }
        }
        return count;
    }

    //Approach - 2
    public static int counting(String input, char targetChar){
        return input.length() - input.replace(String.valueOf(targetChar), "").length();
    }

    //Approach - 3
    public static long countOccurrence(String str, char ch){
        return str.chars()
                .filter(c -> c == ch)
                .count();
    }


    public static void main(String[] args) {
        //1
        int result = countOccur("Shivangi", 'i');
        System.out.println("Result provided by using loop: " + result);

        //2
        int result2 = counting("Shivangi", 'g');
        System.out.println("Result provided by using String: " + result2);

        //3
        long result3 = countOccurrence("Shivangi", 'S');
        System.out.println("Result provided by using Java 8: " + result3);


    }
}
