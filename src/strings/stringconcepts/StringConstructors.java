package strings.stringconcepts;

public class StringConstructors {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c'};
        String s = new String(chars);
        System.out.println(s);

        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f'};
        String a = new String(chars1, 2, 3);
        System.out.println(a);

        char[] c = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        byte[] ascii = {65, 66, 67, 68, 69, 70};
        String s3 = new String(ascii);
        System.out.println(s3); //ABCDEF
        String s4 = new String(ascii, 2, 3);
        System.out.println(s4); //CDE

        String age = "9";
        String string = "He is " + age + " years old.";
        System.out.println(string); //He is 9 years old.
    }
}
