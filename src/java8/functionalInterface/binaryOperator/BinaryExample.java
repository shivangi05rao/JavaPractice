package java8.functionalInterface.binaryOperator;

import java8.functionalInterface.predicate.Person;

import java.util.function.BinaryOperator;

public class BinaryExample {
    public static void main(String[] args) {
        Person person = new Person("John", 23, 2);
        Person person1 = new Person("Alex", 32, 7);
        BinaryOperator<Person> operator = (p1, p2) -> {
            p1.name = p2.name;
            p1.age =  p2.age;
            return p1;
        };
        operator.apply(person, person1);
        System.out.println("Person name: " + person.getName() + " Person age: " + person.age);
    }
}
