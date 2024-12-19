package java8.lambdaExpression;

interface Shape {
    void draw();
}

//class Rectangle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Rectangle draw method");
//    }
//}
//
//class Square implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Square draw method");
//    }
//}
//
//class Circle implements Shape {
//    @Override
//    public void draw() {
//        System.out.println("Circle draw method");
//    }
//}

public class LambdaExample {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle();
//        rectangle1.draw();

//        Shape rectangle = () -> System.out.println("Rectangle draw method");
//        rectangle.draw();
//        print(rectangle); //passing lambda expression to method

        //Assigning lambda expression without variable
        print(() -> System.out.println("Rectangle draw method"));
        print(() -> System.out.println("Square draw method"));
        print(() -> System.out.println("Circle draw method"));

    }

    private static void print(Shape shape) {
        shape.draw();
    }
}
