package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOfMethod {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        stream.forEach(System.out::print); //p -> System.out.println(p)
        System.out.println();

        //Let’s say you have a list of integers, and you want to:
        //	•	Filter out even numbers.
        //	•	Square the remaining odd numbers.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n ->  n * n)
                .toList();
        System.out.print(result + " "); //[1, 9, 25, 49, 81]
    }
}
