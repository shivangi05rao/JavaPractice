package java_coding_problems_book.stringsquestion;

public class HighestOccurringCharacter {

    public static char highestOccur(String input){
        int[] arr = new int[256];
        for (int i = 0; i<input.length(); i++){
            arr[input.charAt(i)] += 1;
        }
        int max = -1;
        char c = ' ';
        for (int i = 0; i < input.length(); i++){
            if (max < arr[input.charAt(i)]){
                max = arr[input.charAt(i)];
                c = input.charAt(i);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        char ch = highestOccur("abaafdfbda");
        System.out.println(ch);
    }
}
