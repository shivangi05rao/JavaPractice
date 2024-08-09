package stringbuilder;

public class StringBui {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);

        System.out.println(sb.charAt(0));

        //set char
//        sb.setCharAt(0, 'P');
//        System.out.println(sb);

        sb.insert(2, 'n');
        System.out.println(sb);

        //delete char
        sb.delete(2,3);
        System.out.println(sb);

        sb.append("s");
        System.out.println(sb);

        System.out.println(sb.length());
    }
}
