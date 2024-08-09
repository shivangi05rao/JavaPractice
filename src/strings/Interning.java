package strings;

public class Interning {
    public static void main(String[] args) {
        //Interning is pointing the instantiated strings to the same address
        //This is done to save space
        //new keyword is used to avoid interning
        //Strings are immutable, technically we cant change particular character or string in java Strings
        //Interning exists that's why immutability exists
        //It cant be changed like this s.charAt(0) = 'D' --> This is wrong
        //performance of String is poor, but it can be improved or controlled by String Builders

        String s = "Hello";
//        String x = "Hello";
//        x = "Mello";
//        System.out.println(s);
//        System.out.println(x);
        //Characters in string can be changed using substring -->
        s = s.substring(0,2) + "y" + s.substring(3);
        System.out.println(s);


    }
}
