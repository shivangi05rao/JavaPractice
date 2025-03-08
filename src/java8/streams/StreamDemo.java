package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //source, intermediate operation & terminal operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5); //source
        System.out.println(numbers.stream().filter(x -> x % 2 == 0) //intermediate operation
                .count()); //terminal operation

        //Creating streams using collections(List, set)
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        //list.stream();

        //From Arrays
        String[] arr = {"a", "b", "b"};
        //Arrays.stream(arr);

        //Using Stream.of
        Stream<String> string = Stream.of("a", "b");

        //Infinite stream
        Stream.generate(() -> 1);
        List<Integer> list1 = Stream.iterate(1, x -> x + 1).limit(100).toList();
        System.out.println(list1);



    }
}
