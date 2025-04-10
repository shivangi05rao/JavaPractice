package java8;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //1. Collecting to a List
        List<String> names = Arrays.asList("Shivangi", "Shailza", "Aditi", "Gaurav");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        //2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> set = nums.stream()
                .collect(Collectors.toSet());
        System.out.println(set);

        //3. Collecting to a specified collection
        ArrayDeque<String> collect = names.stream()
                .collect(Collectors.toCollection(() -> new ArrayDeque<>()));
        System.out.println(collect);

        //4. Joining Strings
        String collect1 = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
        System.out.println(collect1);

        //5. Summarizing Data
        List<Integer> numbers = Arrays.asList(2, 3, 5, 7, 11);
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + stats.getCount());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());

        //for direct summarizing
        Double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: " + avg);
    }
}
