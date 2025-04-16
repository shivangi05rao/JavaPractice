package LogicBuildingGfg.basicprobs;

import java.util.ArrayList;

public class MultiplicationTable {
    static ArrayList<Integer> table(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(n * i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(table(5));
    }
}
