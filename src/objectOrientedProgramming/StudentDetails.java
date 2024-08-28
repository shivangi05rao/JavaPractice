package objectOrientedProgramming;

class Student{
    String fName;
    String lName;
    int age;

    public void printDetails(){
        System.out.println(this.fName);
        System.out.println(this.lName);
        System.out.println(this.age);
    }
//    Student(){ Non parameterised constructor
//        System.out.println("Constructor called");
//    }
//    Student(String fName, String lName, int age){ //Parameterised Constructor
//        this.fName = fName;
//        this.lName = lName;
//        this.age = age;
//    }
    Student(Student s2){        //Copy Constructor
        this.fName = s2.fName;
        this.lName = s2.lName;
        this.age = s2.age;
    }
    Student(){

    }
}
public class StudentDetails {
    public static void main(String[] args) {
        //       Student s1 = new Student();  //For Non Parameterised Constructor
//        s1.fName = "Shivangi";
//        s1.lName = "Rao";
//        s1.age = 22;

//        Student s2 = new Student();
//        s2.fName = "Shailza";
//        s2.lName = "Rao";
//        s2.age = 25;

//        s1.printDetails();
//        s2.printDetails();

//        Student s1 = new Student("Shivangi", "Rao", 22); //For Parameterised Constructor
//            s1.printDetails();

        Student s1 = new Student(); //For Copy Constructor
        s1.fName = "Shivangi";
        s1.lName = "Rao";
        s1.age = 22;

        Student s2 = new Student(s1);
        s2.printDetails();
    }

}
