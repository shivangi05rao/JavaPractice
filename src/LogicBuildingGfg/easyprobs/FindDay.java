package LogicBuildingGfg.easyprobs;

public class FindDay {
    //formula based doesn't work for leap years
    static int dayOfWeek(int d, int m, int y) {
        int[] monthCode = {6, 2, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};

        if (m < 3) {
            y -= 1;
        }

        int yearCode = (y % 100) + (y % 100) / 4;

        yearCode = (yearCode + (y / 100) / 4 + 5 * (y / 100)) % 7;

        return (d + monthCode[m - 1] + yearCode) % 7;
    }

    //Zeller’s Congruence-Based Approach
    static int dayOfWeek2(int d, int m, int y) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (m < 3) {
            y--;
        }
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }

    public static void main(String[] args) {
        System.out.println(dayOfWeek(19, 4, 2025));
        System.out.println(dayOfWeek2(19, 4, 2025));
    }
}
