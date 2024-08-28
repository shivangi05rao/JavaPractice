package objectorientedprogramming.polymorphism.methodOverriding;

class Shape {
    //overriden method
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Overriding method
    public double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    //Overriding method
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class ShapeDriver {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2, 2);
        System.out.println("Area of Circle: " + shapes[0].getArea());
        System.out.println("Area of rectangle: " + shapes[1].getArea());
    }
}
