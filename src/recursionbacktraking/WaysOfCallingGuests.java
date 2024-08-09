package recursionbacktraking;

public class WaysOfCallingGuests {
    //Find the no. of ways in which you can invite n people to your party , single or in pairs
    public static int callGuests(int n){
        if (n<=1){
            return 1;
        }
        int singleWay = callGuests(n-1);
        int inPairs = (n-1) * callGuests(n-2);
        return singleWay + inPairs;
    }

    public static void main(String[] args) {
        int totalWays = callGuests(4);
        System.out.println(totalWays);
    }
}
