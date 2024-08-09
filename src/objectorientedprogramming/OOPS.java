package objectorientedprogramming;

class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.color = "Blue";
        p1.type = "Gel";
        p1.write();

        pen p2 = new pen();
        p2.color = "Black";
        p2.type = "Ball Point";

        p1.printColor();
        p2.printColor();
    }
}
