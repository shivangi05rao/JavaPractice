package java8.streams.map;

import java.util.ArrayList;
import java.util.List;

public class MapMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dave");
        list.add("joe");
        list.add("ryan");
        list.add("Ian");

        list.stream()
                .map(String::toUpperCase) //v -> v.toUpperCase()
                .forEach(System.out::println);
    }
}


