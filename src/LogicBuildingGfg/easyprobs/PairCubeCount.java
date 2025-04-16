package LogicBuildingGfg.easyprobs;

public class PairCubeCount {
    //Naive Approach
    static int pairCube(int n) {
        int count = 0;
        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <= n; j++){
                if ((i * i * i) + (j * j * j)  == n) {
                    count++;
                }
            }
        }
        return count;
    } //O(n^2) time and O(1) space

    static int differentPairs(int n) {
        int count = 0;
        for (int i = 1; i < Math.cbrt(n); i++) {
            int cb = i * i * i;
            int diff = n - cb;
            int cbrtDiff = (int) Math.cbrt(diff);
            if (cbrtDiff * cbrtDiff * cbrtDiff == diff) {
                count++;
            }
        }
        return count;
    }//O(n1/3) time and O(1) space

    public static void main(String[] args) {
        System.out.println(pairCube(28));
        System.out.println(differentPairs(28));
    }
}
