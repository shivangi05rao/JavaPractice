package java8.streams.map;

import java.util.ArrayList;
import java.util.List;

class MapToInt {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Shivangi");
        list.add("Aditi");
        list.add("Gaurav");
        list.add("Shailza");

        list.stream()
                .mapToInt(String::length) //.mapToInt(name -> name.length())
                .forEach(System.out::println);
    }
}
