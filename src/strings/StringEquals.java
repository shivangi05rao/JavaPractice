package strings;

public class StringEquals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1==s2); //true --> == operator checks the address //Same address
        System.out.println(s1==s3); //false --> Different address
        System.out.println(s1.equals(s3)); // --> true --> equals checks the character, char by char


    }
}
