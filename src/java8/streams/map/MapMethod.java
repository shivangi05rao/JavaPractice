package java8.streams.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MapMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("dave");
        list.add("joe");
        list.add("ryan");
        list.add("Ian");

        list.stream()
                .map(v ->  v.toUpperCase())//v -> v.toUpperCase()
                .forEach(v -> System.out.println(v));
    }
}


