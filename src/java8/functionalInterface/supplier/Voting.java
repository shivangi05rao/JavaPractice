package java8.functionalInterface.supplier;

import java8.functionalInterface.predicate.Person;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Voting {
    static boolean isEligibleForVoting(Supplier<Person> personSupplier, Predicate<Person> personPredicate){
        return personPredicate.test(personSupplier.get());
    }

    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Richard", 32, 12);
        Predicate<Person> predicate = p -> p.age > 18;

        boolean eligible = isEligibleForVoting(supplier, predicate);
        System.out.println("Person is eligible to vote: " + eligible);
    }
}
