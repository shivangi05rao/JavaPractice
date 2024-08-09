package java_coding_problems_book.stringsquestion;

public class RemoveLeadingAndTrailingSpaces {

    //Approach - 1
    public static void removeLeadingTrailingSpaces1(String input){
        String trimmed = input.trim();
        System.out.println(trimmed);
    }

    public static void removeLeadingTrailingSpaces2(char space){
        String input = space + "\n \n \n hello \t \n \r" + space;
        String stripped = input.strip();
        System.out.println(stripped);
    }

    public static void main(String[] args) {
        removeLeadingTrailingSpaces1("\n \n \n hello \t \n \r");
        removeLeadingTrailingSpaces2('\u2002');
    }
}
