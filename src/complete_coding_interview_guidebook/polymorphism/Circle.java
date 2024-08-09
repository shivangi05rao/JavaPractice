package complete_coding_interview_guidebook.polymorphism;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw a circle ...");
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();

        rectangle.draw();
        circle.draw();
    }
}
