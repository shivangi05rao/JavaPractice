package java8.streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class filterMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(45);
        list.add(6);

        list.stream()
                .filter(num -> num > 10)
                .forEach(System.out::println);

        System.out.println("Original list is not modified");
        list.forEach(x -> System.out.print(x + " "));

        List<Integer> newList;
        newList = list.stream().filter(num -> num >= 15).toList();
        newList.forEach(x -> System.out.println("Number greater than 15: " + x));
    }
}
