package java8.javabrains;

public class TypeInferenceExample {
    public static void main(String[] args) {
        printLength(s -> s.length());
    }

    private static void printLength(StringLength l){
        System.out.println(l.getLengthOfString("Shivangi"));
    }
}

interface StringLength {
    int getLengthOfString(String s);
}
