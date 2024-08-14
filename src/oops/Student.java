package oops;

//creating a user defined data type --> Student
public class Student {
    String name;
    private int age;
    char gender;

    //Using final keyword
    final String schoolName = "Divine Public School";

    //Using static keyword in variable
    //Also using private access modifier to prevent any changes in the given attribute
    private static int numberOfStudents;

    //creating a constructor --> It is special method, used to initialize objects of a class. It has same name as
    //the class and is called when an object is created. --> It's purpose is to set initial value for the object's attributes.

    //default constructor
    public Student() {

    }

    //parameterized constructor
    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        numberOfStudents++;
    }

    //getter and setters
    //using static keyword in the method in order to call the attribute using the 'class'
    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
        s1.gender = 'F';
        System.out.println(s1.name);
        System.out.println(s1.getAge());
        System.out.println(s1.gender);
        System.out.println(s1.schoolName);


        Student s2 = new Student("Aditi", 4, 'F');
        System.out.println(s2.name);
        System.out.println(s2.getAge());
        System.out.println(s2.gender);
        System.out.println(s2.schoolName);
        System.out.println(getNumberOfStudents());


        Student s3 = new Student("Shailza", 3, 'F');
        System.out.println(getNumberOfStudents());
        Student s4 = new Student("Gaurav", 2, 'M');
        System.out.println(Student.getNumberOfStudents());
    }
}
