package java8.functionalInterface.predicate;

import java.util.function.Predicate;

public class AndPredicate {
    //we need to check if a person is eligible for club membership.
    // The criteria is that the person’s age should be more than 18 and less than 60.
    static boolean isPersonEligibleForMembership(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }

    public static void main(String[] args) {
        Person person = new Person("Alex", 43, 22);

        Predicate<Person> greaterThanEighteen = p -> p.age > 18;
        Predicate<Person> lessThanSixty = p -> p.age < 60;

        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);

        boolean membership = isPersonEligibleForMembership(person, predicate);
        System.out.println("Person is eligible for membership:   " + membership);
    }
}

