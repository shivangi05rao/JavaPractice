package java8.streams.operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        //filter
        List<String> list = Arrays.asList("Shivangi", "Aditi", "Gaurav", "Shailza", "Shivangi");
        Stream<String> startsWithA = list.stream().filter(x -> x.startsWith("S"));
       //no filtering at this point
        long count = startsWithA.count();
        System.out.println(count); //count operation
        //Or
        //startsWithA.forEach(x -> System.out.println(x)); //print op

        //map
        list.stream()
                .map(String::toUpperCase).forEach(System.out::println);

        //sorted
        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 2, 0, 2);
        numbers.stream().sorted().forEach(System.out::println);
        list.stream().sorted((a, b) -> b.length() - a.length()).forEach(System.out::println);

        //distinct
        list.stream().filter(x -> x.startsWith("S")).distinct().forEach(System.out::println);

        //limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        Stream.of(8, 2, 9, 4, 5).limit(3).forEach(System.out::println);

        //peek
        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

        //skip
        Stream.of(1, 2, 3, 4, 5, 6)
                .skip(2)
                .forEach(System.out::println);

        Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(100)
                .forEach(System.out::println);

        System.out.println(Stream.iterate(1, x -> x + 1)
                .skip(10)
                .limit(100)
                .count()
        );

        //flatMap
        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5));
        listOfLists.stream()
                .flatMap(List::stream)
                .forEach(System.out::println);

        List<List<String>>  listOfListFruits = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("orange", "kiwi"),
                Arrays.asList("pear", "grape"));
        System.out.println(listOfListFruits.get(2).get(1));
        //using flatmap
        System.out.println(listOfListFruits.stream()
                .flatMap(x -> x.stream())
                .map(x-> x.toUpperCase())
                .toList()
        );

        List<String> sentences = Arrays.asList(
                "Hello World",
                "Java streams are useful",
                "flat map are powerful"
        );
        System.out.println(sentences
                .stream().
                flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase).toList()
        );
    }
}
