package LogicBuildingGfg.easyprobs;

public class DigitalRoot {
    //The digital root of a positive integer is found by summing the digits of the integer.
    // If the resulting value is a single digit then that digit is the digital root.
    // If the resulting value contains two or more digits, those digits are summed and the process is repeated.
    // This is continued as long as necessary to obtain a single digit.
    //Given a number, the task is to find its digital root.
    // The input number may be large and it may not be possible to store even if we use long int.

    static int singleDigit(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 9 == 0) {
            return 9;
        }

        return n % 9;
    } //Time Complexity: O(1), Auxiliary Space: O(1)

    public static void main(String[] args) {
        System.out.println(singleDigit(1234));
    }
}
