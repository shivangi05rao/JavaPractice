package arrays;
class ArrayExample {

    void multiArrays() {
        int[][] arr2 = {{2, 3, 5}, {1, 6, 7}, {4, 7, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2[i][j] + " ");
            }
        }
    }

    void demoArrays() {
        int[] ages = new int[5];
        float[] weights = new float[3];
        String[] name = {"Shailza", "Shivangi", "Gaurav"};

        ages[0] = 12;
        ages[1] = 19;
        ages[2] = 16;
        ages[3] = 76;
        ages[4] = 45;


        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        for (int i = 0; i < 5; i++) {
            System.out.println(ages[i]);
        }
        for (int age : ages) {
            System.out.println(age);
        }
        int i = 0;
        while (i < 5) {
            System.out.println(ages[i]);
            i = i + 1;
        }
    }
}

public class ArrayEx {
    public static void main(String[] args) {
        ArrayExample arr = new ArrayExample();
        arr.demoArrays();
        arr.multiArrays();
    }
}
