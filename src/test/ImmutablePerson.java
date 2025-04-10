package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutablePerson {
   private final String name;
   private final int age;
   private final List<String> addresses;

   public ImmutablePerson(String name, int age, List<String> addresses){
       this.name = name;
       this.age = age;
       this.addresses = Collections.unmodifiableList(new ArrayList<>(addresses));
   }

   public String getName() {
       return name;
   }

   public int getAge() {
       return age;
   }

   public List<String> getAddresses() {
       return addresses;
   }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        boolean first = s1 == s2;
        boolean sec = s2 == s3;
        boolean third = s1.equals(s2);
        boolean forth = s2.equals(s3);
        System.out.println(first);
        System.out.println(sec);
        System.out.println(third);
        System.out.println(forth);
    }
}
