package complete_coding_interview_guidebook.polymorphism;

public class Triangle {
    //Polymorphism via method overriding
    public void draw(){
        System.out.println("Draw default triangle...");
    }

    public void draw(String color){
        System.out.println("Draw a triangle of color " + color);
    }

    public void draw(int size, String color){
        System.out.println("Draw a triangle of color " + color + " and scale it up with the new size of " + size);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.draw("red");
        triangle.draw(10, "blue");
    }
}
