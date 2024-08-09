package controlstatements;

//Demonstrate if else if ladder
public class IfElseIfLadder {
    public static void main(String[] args) {
        int month = 4;  //April
        String season;
        if (month == 12 || month == 1 || month == 5)
            season = "Winter";
        else if (month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if (month == 6 || month == 7 || month == 8)
            season = "Autumn";
        else
            season = "Bogus Month";
        System.out.println("April is in the " + season + ".");
    }
}
