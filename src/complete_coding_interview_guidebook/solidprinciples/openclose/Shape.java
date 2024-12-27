package complete_coding_interview_guidebook.solidprinciples.openclose;

import java.util.List;

public interface Shape {

    public double area();
}

class Rectangle implements Shape {

    private final int width;
    private final int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle implements Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class AreaCalculator {

    private final List<Shape> shapes;

    public AreaCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double sum() {
        int sum = 0;

        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
}
