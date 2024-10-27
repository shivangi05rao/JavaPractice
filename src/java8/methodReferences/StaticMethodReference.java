package java8.methodReferences;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodReference {
    public static int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");


        //Code without using method reference
        list.stream()
                .mapToInt(str -> StaticMethodReference.getLength(str))
                .forEach(System.out::println);

        list.stream()
                .mapToInt(StaticMethodReference::getLength)
                .forEach(System.out::println);
    }
}
