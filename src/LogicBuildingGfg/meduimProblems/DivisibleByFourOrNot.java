package LogicBuildingGfg.meduimProblems;

public class DivisibleByFourOrNot {
    //Using the modulo division operator “%”
    static void divisibleByFour(long n) {
        if (n % 4 == 0) {
            System.out.println("True");
        } else {
            System.out.println(false);
        }
    }

    //Checking Divisibility of the Last 2 Digits
    static boolean divisibleByFourLongNum(String number){
        int len = number.length();
        String lastTwoDigits = len == 1? number : number.substring(len - 2);
        int lastTwo = Integer.parseInt(lastTwoDigits);
        return lastTwo % 4 == 0;
    } // Time Complexity: O(1), Space Complexity: O(1)


    public static void main(String[] args) {
        divisibleByFour(6767);
        System.out.println(divisibleByFourLongNum("123456789045678934561243516"));
    }
}
