package java8.streams.filter;

import java.util.ArrayList;
import java.util.List;

class filterChaining {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Dave", 23));
        list.add(new Person("John", 18));
        list.add(new Person("Ryan", 54));
        list.add(new Person("Ian", 5));
        list.add(new Person("Ray", 63));

        list.stream()
                .filter(person -> person.getName() != null)
                .filter(person -> person.getAge() > 18)
                .filter(person -> person.getAge() < 60)
                .forEach(System.out::println);
    }
}
