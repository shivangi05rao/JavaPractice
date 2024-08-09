package java_coding_problems_book.stringsquestion;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoiningMultipleStringWithDelimiter {

    //Approach - 1
    public static String joinByDelimiter(char delimiter, String... args){
        StringBuilder result = new StringBuilder();
        int i;
        for (i = 0; i < args.length; i++){
            result.append(delimiter).append(args[i]);
        }

        return result.toString();
    }

    //Approach - 2 Java 8
    public static String joinByDelim(char delimiter, String... args){
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));

        for (String arg: args){
            joiner.add(arg);
        }

        return joiner.toString();
    }

    //Approach - 3 Java 8
    public static String joinBy(char delimiter, String... args){
        return Arrays.stream(args, 0, args.length)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }


    public static void main(String[] args) {

        //1
        String res = joinByDelimiter('&', "Shivangi", "John", "Doe");
        System.out.println(res);

        //2
        String result = joinByDelim('$', "Shivangi", "Aditi", "Doe", "Alice");
        System.out.println(result);

        //3
        String result2 = joinBy('^', "Shivangi", "Aditi", "Doe", "Alice", "John");
        System.out.println(result2);
    }
}
