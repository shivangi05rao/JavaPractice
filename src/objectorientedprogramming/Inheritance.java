package objectorientedprogramming;

//When a class takes(inherits) properties or methods of different class is called inheritance.
//In java inheritance has 4 types --> Single Level, Multi Level Inheritance, Hierarchical Inheritance, Hybrid Inheritance
class Shape{ //Base class/Parent Class (Class which shares the property of its class)
    String color;
    public void area(){
        System.out.println("Gives area");
    }
}
class Triangle extends Shape{ //Derived class/Child Class (The class which take the property of the base class) //Single Level
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class Circle extends Shape{ //Hierarchical Inheritance
    public void area(int r) {
        System.out.println(3.14*r*r);
    }
}
class EquilateralTriangle extends Triangle{ //Derived Class & Multi Level Inheritance
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}
