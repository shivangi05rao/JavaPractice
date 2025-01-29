package java8.functionalInterface.predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    static boolean isEligibleForVoting(Person person, Integer minAge, BiPredicate<Person, Integer> predicate){
        return predicate.test(person, minAge);
    }

    public static void main(String[] args) {
        Person person = new Person("Ram", 76, 56);
        boolean eligible = isEligibleForVoting(person, 18, (p, minAge) -> {return p.age > minAge;});
        System.out.println("Person is eligible for voting: " + eligible);
    }
}
