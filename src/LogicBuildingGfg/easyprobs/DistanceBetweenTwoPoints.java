package LogicBuildingGfg.easyprobs;

public class DistanceBetweenTwoPoints {
    static int distance(int x1, int y1, int x2, int y2) {
        return (int) Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public static void main(String[] args) {
        System.out.println(distance(0, 0, 2, 2));
    }
}
