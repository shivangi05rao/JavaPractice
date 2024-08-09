package examples;

public class PointsLiesOnStraightLine {
    public static void main(String[] args) {
        double x1 = 1, x2 = 2, x3 = 3, y1 = 1, y2 = 2, y3 = 3;
        double m1 = (y2 - y1)/(x2 - x1);
        double m2 = (y3 - y2)/(x3 - x2);
        if (m1==m2){
            System.out.println("The three points lie on a straight line.");
        } else {
            System.out.println("NO");
        }
    }
}
