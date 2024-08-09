package recursionbacktraking;

public class PlaceTiles {
    //Place tiles of size 1xm int a floor of size nxm
    public static int tilePlacement(int n, int m){
        if (n == m){
            return 2;
        }

        if (n < m){
            return 1;
        }
        //place vertically
        int verPlacements = tilePlacement(n-m, m);
        //place horizontally
        int horPlacements = tilePlacement(n-1, m);
        return verPlacements + horPlacements;
    }

    public static void main(String[] args) {
        System.out.println(tilePlacement(4,2));

    }
}
