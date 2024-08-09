package controlstatements;
public class NestedSwitch {
    public static void main(String[] args) {
        int outerValue = 2;
        int innerValue = 1;

        switch (outerValue) {
            case 1:
                System.out.println("Outer Case 1");
                switch (innerValue) {
                    case 1:
                        System.out.println("Inner Case 1");
                        break;
                    case 2:
                        System.out.println("Inner Case 2");
                        break;
                }
                break;
            case 2:
                System.out.println("Outer Case 2");
                // More code for Case 2...
                break;
            // More cases for the outer switch...
        }
    }
}

