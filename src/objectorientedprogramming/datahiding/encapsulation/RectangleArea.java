package objectorientedprogramming.datahiding.encapsulation;

public class RectangleArea {
    private int length;
    private int width;

    RectangleArea(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        return length * width;
    }

    public static void main(String[] args) {
        RectangleArea ra = new RectangleArea(2, 2);
        System.out.println(ra.getArea());
    }
}
