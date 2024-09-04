package objectOrientedProgramming.polymorphism;

//Poly = Many, morphism =  different ways to do anything
//Types --> Function overloading(Compile time polymorphism), Function Overriding(run time polymorphism)
//Function overloading --> Same name but different working properties
class Student1{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+ " " +age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Shivangi";
        s1.age = 22;
        s1.printInfo(s1.name);
    }
}
