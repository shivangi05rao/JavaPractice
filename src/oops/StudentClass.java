package oops;

public class StudentClass {
    public static void fun(Student x){
        System.out.println(x.name);
    }

//    public static void change(Student x){
//        x.name = "Ranu";
//    }

    public static void main(String[] args) {
//        Student student = new Student();
//        student.name = "Shivangi";
//       // student.age = 1;
//        student.gender = 'F';
//
//        Student student1 = new Student();
//        student1.name = "Aditi";
//       // student1.age = 4;
//        student1.gender = 'F';

//        fun(student1);
//        System.out.println(student.name);
//        change(student);
//        System.out.println(student.name);

        //Accessing the private classes using getters and setters
//        student.setAge(1);
//        System.out.println(student.getAge());

        //Using constructor for initializing the objects
        Student s1 = new Student();
        s1.name = "Shivangi";
        //Using getter and setter along with constructor
        s1.setAge(1);
        s1.gender ='F';
        System.out.println(s1.name);
        System.out.println(s1.getAge());
        System.out.println(s1.gender);
        System.out.println(s1.schoolName);


        Student s2 = new Student("Aditi", 4, 'F');
        System.out.println(s2.name);
        System.out.println(s2.getAge());
        System.out.println(s2.gender);
        System.out.println(s2.schoolName);
      //  System.out.println(s2.getNumberOfStudents());


        Student s3 = new Student("Shailza", 3, 'F');
      //  System.out.println(s3.getNumberOfStudents());
        Student s4 = new Student("Gaurav", 2, 'M');
        System.out.println(Student.getNumberOfStudents());
    }
}
