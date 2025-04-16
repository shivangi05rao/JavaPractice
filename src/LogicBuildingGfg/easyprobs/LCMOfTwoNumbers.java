package LogicBuildingGfg.easyprobs;

public class LCMOfTwoNumbers {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd (a, b);
    } //Time Complexity: O(log(min(a,b)), Auxiliary Space: O(log(min(a,b))

    public static void main(String[] args) {
        System.out.println(lcm(12, 18));
    }
}
