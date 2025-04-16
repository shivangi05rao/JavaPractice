package LogicBuildingGfg.basicprobs;

public class DiceProblem {
    static int diceNum(int n) {
        int ans = 7 - n;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(diceNum(6));
    }
}
