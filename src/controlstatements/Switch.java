package controlstatements;

public class Switch {
    public static void main(String[] args) {
        for (int i=0; i<6; i++) {
            switch (i) {
                case 0:
                    System.out.println(i + " i is zero");
                    break;
                case 1:
                    System.out.println(i + " i is one");
                    break;
                case 2:
                    System.out.println(i + " i is two");
                    break;
                case 3:
                    System.out.println(i + " i is three");
                    break;
                default:
                    System.out.println("i is greater than 3");
            }
        }
    }
}
