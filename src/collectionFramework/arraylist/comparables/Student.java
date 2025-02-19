package collectionFramework.arraylist.comparables;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob", 3.7));
        students.add(new Student("Charlie", 3.5));
        students.add(new Student("Shivangi", 3.9));
        students.sort(null);
        System.out.println(students);
    }
}
