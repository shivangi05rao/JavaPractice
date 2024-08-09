package examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    String name;
    int age;
    int rollNo;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
}


class Demo_99 {

    public static void main(String[] args) {
        Student shivi = new Student("Shivi", 11, 12);
        Student shivangi = new Student("Shivi", 11, 18);

        List<Student> list = Arrays.asList(shivi, shivangi);

        Collections.sort(list);
        list.stream()
                .forEach(val -> System.out.println(val.rollNo));
    }
}
