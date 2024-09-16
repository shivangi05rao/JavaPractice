package java8.fucntionalInterface.predicate;

import java.util.function.Predicate;

public class OrPredicate {
    //we need to check if a person is eligible for retirement.
    // The criteria are that either the person’s age should be more than 60 or the year of service should be more than 30.

    static boolean eligibleForRetirement(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Ramesh", 54, 20);
        Predicate<Person> ageMoreThanSixty = p -> p.age > 60;
        Predicate<Person> yearOfService = p -> p.yearOfService > 30;

        Predicate<Person> predicate = ageMoreThanSixty.or(yearOfService);

        boolean retirement = eligibleForRetirement(person, predicate);
        System.out.println("Person is eligible for retirement: " + retirement);
    }
}
