package java8.methodReferences.instanceMethodReference;

import java.util.ArrayList;
import java.util.List;

public class ForParticularObject { //of a particular object
    public int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("done");
        list.add("word");
        list.add("practice");
        list.add("fake");


        ForParticularObject instanceMethodReference = new ForParticularObject();
        //Code without using method reference
//        list.stream()
//                .mapToInt(str -> instanceMethodReference.getLength(str))
//                .forEach(System.out::println);


        //Code using method reference
        list.stream()
                .mapToInt(instanceMethodReference::getLength)
                .forEach(System.out::println);
    }
}
