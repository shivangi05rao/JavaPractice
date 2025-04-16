package LogicBuildingGfg.basicprobs;

import java.util.ArrayList;
import java.util.List;

public class SwapNums {
    static List<Integer> swap(int a, int b) {
        List<Integer> list = new ArrayList<>();
        int temp = a;
        list.add(a = b);
        list.add(b = temp);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(swap(2, 3));
    }
}
