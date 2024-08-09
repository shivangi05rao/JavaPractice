package strings;

public class CopyString {
    public static void main(String[] args) {
        String src = "Just a string";
        int lSrc = src.length();
        System.out.println(lSrc);
        String dsc = "";
        dsc = src;
        System.out.println(src);
        System.out.println(dsc);
    }
}
