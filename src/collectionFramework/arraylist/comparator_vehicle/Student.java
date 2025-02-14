package collectionFramework.arraylist.comparator_vehicle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private double gpa;

    public Student (String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));// a
        students.add(new Student("Bob", 3.7));// b
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Shivangi", 3.9));
//        students.sort((a, b) ->{
//            if ((b.getGpa() - a.getGpa()) > 0) {
//                return 1;
//            } else if ((b.getGpa() - a.getGpa() < 0)) {
//                return -1;
//            } else {
//                return 0;
//            }
//        });

        //Using method reference
//        Comparator<Student> comparator = Comparator.comparing(Student::getGpa);
//        students.sort(comparator);

        //for descending order
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed();
        students.sort(comparator);

        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }
    }
}
