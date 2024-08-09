package java_coding_problems_book.stringsquestion;

public class RemovingGivenCharacters {

    //Approach - 1 Using replaceAll() provided by string class
    public static void removeChar1(String input){
        String plainInput = input.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(plainInput);
    }

    public static void main(String[] args) {
        removeChar1("$Ja!va$&St%ar*");
    }
}
