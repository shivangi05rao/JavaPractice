package closerlookatmethodsandclasses;
//Demonstrate String Arrays
public class DemonsString {
    public static void main(String[] args) {
//        String[] str = {"one", "two", "three"};
//        for (int i=0; i<str.length; i++){
//            System.out.println("str[" + i + "]: " + str[i]);
//        }
        String str1 = "First String";
        String str2 = "Second String";
        String str3 = str1;

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Char at index 3 in str1: " + str1.charAt(3));

        if (str1.equals(str2))
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");

        if (str1.equals(str3))
            System.out.println("str1 == str3");
        else
            System.out.println("str1 != str3");
    }
}
