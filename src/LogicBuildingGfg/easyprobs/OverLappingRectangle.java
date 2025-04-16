package LogicBuildingGfg.easyprobs;

public class OverLappingRectangle {
   static class Point {
       int x, y;

       Point(int x, int y) {
           this.x = x;
           this.y = y;
       }
   }

   static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
       //if one rectangle is left to the other
       if (l1.x > r2.x || l2.x > r1.x) {
           return false;
       }

       //if one rectangle is above the other
       if (r1.y > l2.y || r2.y > l1.y){
           return false;
       }

       return true;
   }

    static int doOverlapArr(int[] L1, int[] R1, int[] L2, int[] R2) {
        if(L1[0] > R2[0] || L2[0] > R1[0]) {
            return 0;
        }

        if((R1[1] > L2[1]) || (R2[1] > L1[1])) {
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(-10, 5);
        Point r2 = new Point(-1, 0);

        if (doOverlap(l1, r1, l2, r2)) {
            System.out.println("Rectangle overlaps!");
        } else {
            System.out.println("Rectangle does not overlaps!");
        }
        int res = doOverlapArr(new int[]{0, 10}, new int[]{10, 0}, new int[]{5, 5}, new int[]{15, 0});
        System.out.println(res);
    }
}
