package java8.streams.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 3, 4, 9, 6, 7);
        //collect
        List<Integer> collect = list.stream().skip(4).collect(Collectors.toList());
        List<Integer> collect1 = list.stream().toList();

        //forEach
        list.forEach(System.out::println);

        //reduce
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        //count
        System.out.println(list.stream().filter(x -> x % 2 ==0).count());

        //anyMatch
        System.out.println(list.stream().anyMatch(x -> x == 2));

        //allMatch
        System.out.println(list.stream().allMatch(x -> x > 0));

        //noneMatch
        System.out.println(list.stream().noneMatch(x -> x > 0));

        //findFirst
        System.out.println(list.stream().findFirst().get()) ;

        //findAny
        System.out.println(list.stream().findAny().get());

        //toArray()
        Object[] array = Stream.of(1, 2, 3).toArray();

        //min
        System.out.println("Min: " + Stream.of(8, 2, 3, 76).min(Comparator.naturalOrder()).get());

        //max
        System.out.println("Max: " + Stream.of(8, 2, 3, 76).max(Comparator.naturalOrder()).get());

        //forEachOrdered
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Using forEach with parallel streams");
        numbers.parallelStream().forEach(System.out::print);
        System.out.println("Using forEachOrdered with parallel streams");
        numbers.parallelStream().forEachOrdered(System.out::print);

        System.out.println();

        //Example: Find String greater than length 6
        List<String> list1 = Arrays.asList("Bob", "Aditi", "Gaurav", "Shailza", "Shivangi");
        System.out.println(list1.stream().filter(s -> s.length() > 6).toList());

        //Example: Square and sort the list
        System.out.println(list.stream().map(x -> x * x).sorted().toList());

        //Example: get the sum of the list
        System.out.println(list.stream().reduce(Integer::sum).get());

        //Example: count the number of occurrences of l in the sentence
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());
    }
}
