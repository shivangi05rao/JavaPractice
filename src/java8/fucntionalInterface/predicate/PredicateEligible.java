package java8.fucntionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateEligible {

    static boolean isPersonEligibleToVote(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }


    public static void main(String[] args) {
        Person person = new Person("John", 12, 0);
        Predicate<Person> predicate =  p -> p.age > 18;

        boolean eligible = isPersonEligibleToVote(person, predicate);
        System.out.println("Person is eligible for voting: " + eligible);

    }
}

class Person {
    String name;
    int age;
    int yearOfService;

    Person(String name, int age, int yearOfService){
        this.name = name;
        this.age = age;
        this.yearOfService = yearOfService;
    }
}
