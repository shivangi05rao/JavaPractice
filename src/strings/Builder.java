package strings;

public class Builder {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Hello");
//        str.append("World");
//        System.out.println(str); //HelloWorld
//
//        //Hello -> Mello
//        str.setCharAt(0,'M');
//        System.out.println(str); //MelloWorld
//
//        str.append(2); //String, int, char, boolean, float, etc. can be added in a string builder string using .append
//        System.out.println(str); //MelloWorld2
//
//        str.insert(2,'w'); //.insert is used to insert any char,string etc. in middle or at any required index the String
//        System.out.println(str); //MewlloWorld
//
//        str.deleteCharAt(11); //to delete any char in a string using only the index
//        System.out.println(str);

        StringBuilder sb = new StringBuilder("Physics");
        System.out.println(sb); //Physics
        System.out.println(sb.reverse()); //scisyhP
        sb.reverse();   //Physics
        sb.delete(1,5);
        System.out.println(sb); //Pcs



    }
}
