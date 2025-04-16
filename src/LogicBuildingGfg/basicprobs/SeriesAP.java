package LogicBuildingGfg.basicprobs;

public class SeriesAP {
    public static int nthTerm(int a1, int a2, int n) {
        //naive approach
        int d = a2 - a1;
        int nthTerm = a1;
        for (int i = 1; i < n; i++) {
            nthTerm += d;
        }
        return nthTerm;
    }


    static int nthTermAp(int a1, int a2, int n) {
        return (a1 + (n - 1) * (a2 - a1));
    }

    public static void main(String[] args) {
        System.out.println(nthTerm(2, 3, 4));
        System.out.println(nthTermAp(2, 3, 4));
    }
}
