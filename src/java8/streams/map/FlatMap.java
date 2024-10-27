package java8.streams.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> lists = new ArrayList<>();
        lists.add(Arrays.asList("a", "b", "c"));
        lists.add(Arrays.asList("d", "e", "f"));
        lists.add(Arrays.asList("g", "h", "i"));
        lists.add(Arrays.asList("j", "k", "l"));
        System.out.println(lists);

//        Stream<List<String>> stream1 = lists.stream();
//        Stream<String> stream2 = stream1.flatMap(Collection::stream); //s -> s.stream()
//        Stream<String> stream3 = stream2.filter("a"::equals); //x -> "a".equals(x)
//        stream3.forEach(System.out::println);

        //to filter
        lists.stream()
                .flatMap(Collection::stream)
                .filter("a"::equals)
                .forEach(System.out::println);


        //to collect
        List<String> flatList = lists.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(flatList);

    }
}
