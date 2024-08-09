package java_coding_problems_book.stringsquestion;

public class RemovingWhiteSpacesFromString {

    //Approach - 1
    public static String removeWhiteSpaces(String str){
        return str.replaceAll("\\s", "");
    }

    //Approach - 2
    public static String removeSpaces(String str){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c != ' '){
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
       String res = removeWhiteSpaces("Shivangi Rao");
       System.out.println(res);

       String result = removeSpaces("Java Code");
       System.out.println(result);
    }
}
