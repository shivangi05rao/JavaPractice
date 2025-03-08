package java8.methodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //Method reference
        List<String> students = Arrays.asList("Ram", "Shyam", "Shivangi", "Aditi", "Shailza");
        students.forEach(System.out::println);

        //Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).toList();
    }

}

class MobilePhone {
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}


