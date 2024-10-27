package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Stream<String> stringStream = list.stream();
        stringStream.forEach(System.out::println); //v -> System.out.println(v)
    }
}
