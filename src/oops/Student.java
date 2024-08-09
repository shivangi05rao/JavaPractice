package oops;

//creating a user defined data type --> Student
public class Student{
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
    public Student(){

    }

    //parameterized constructor
    public Student(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        numberOfStudents++;
    }

    //getter and setters
    //using static keyword in the method in order to call the attribute using the 'class'
    public static int getNumberOfStudents(){
        return numberOfStudents;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
