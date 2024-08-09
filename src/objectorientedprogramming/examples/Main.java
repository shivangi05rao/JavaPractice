package objectorientedprogramming.examples;
class Student {
    int rollNo;
    String studentName;
}

public class Main {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.rollNo = 1;
        Student1.studentName = "Shivi";
        System.out.println(Student1.rollNo);
        System.out.println(Student1.studentName);

        Student Student2 = new Student();
        Student2.rollNo = 2;
        Student2.studentName = "Shivangi";
        System.out.println(Student2.rollNo);
        System.out.println(Student2.studentName);

    }
}
