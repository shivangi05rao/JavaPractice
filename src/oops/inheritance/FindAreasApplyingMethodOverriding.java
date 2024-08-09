package oops.inheritance;

//Using run time polymorphism
class Figure{
    double dim1;
    double dim2;

    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    //area is now an abstract method
    double area(){
        System.out.println("Area of figure is undefined: ");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    //override area for rectangle
    double area(){
        System.out.println("Inside Area for rectangle.");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    //override area for rectangle
    double area(){
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
public class FindAreasApplyingMethodOverriding {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());

    }
}

////Using abstract in Figure class
//abstract class Figure{
//    double dim1;
//    double dim2;
//
//    Figure(double dim1, double dim2){
//        this.dim1 = dim1;
//        this.dim2 = dim2;
//    }
//
//    //area is now an abstract method
//    abstract double area();
//}
//
//class Rectangle extends Figure{
//    Rectangle(double dim1, double dim2){
//        super(dim1, dim2);
//    }
//
//    //override area for rectangle
//    double area(){
//        System.out.println("Inside Area for rectangle.");
//        return dim1 * dim2;
//    }
//}
//class Triangle extends Figure{
//    Triangle(double dim1, double dim2){
//        super(dim1, dim2);
//    }
//
//    //override area for rectangle
//    double area(){
//        System.out.println("Inside Area for Triangle.");
//        return dim1 * dim2 / 2;
//    }
//}
//public class FindAreasApplyingMethodOverriding {
//    public static void main(String[] args) {
//     //   Figure f = new Figure(10, 10); //illegal now
//        Rectangle r = new Rectangle(9, 5);
//        Triangle t = new Triangle(10, 8);
//        Figure figref; //This is OK, No object is created
//
//        figref = r;
//        System.out.println("Area is " + figref.area());
//
//        figref = t;
//        System.out.println("Area is " + figref.area());
//    }
//}
