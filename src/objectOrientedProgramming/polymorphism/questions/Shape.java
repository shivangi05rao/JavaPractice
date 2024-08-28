package objectOrientedProgramming.polymorphism.questions;

public class Shape {
    public String getName() {
       return "Shape";
    }
}

class XShape extends Shape {
    private String name;

    XShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return super.getName() + ", " + this.name;
    }

    public static void main(String[] args) {
        XShape s1 = new XShape("Circle");
        System.out.println(s1.getName());
    }
}


