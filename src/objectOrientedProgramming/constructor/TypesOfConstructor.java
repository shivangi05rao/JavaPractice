package objectOrientedProgramming.constructor;

public class TypesOfConstructor {
    private final int day;
    private final int month;
    private final int year;
    private String event;

    public TypesOfConstructor(){ //Default Constructor
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public TypesOfConstructor(int day, int month, int year){ //Parameterized Constructor
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public TypesOfConstructor(TypesOfConstructor other){ //Copy Constructor
        this.day = other.day;
        this.month = other.month;
        this.year = other.year;
        this.event =other.event;
    }

    public TypesOfConstructor(int day, int month, int year, String event){
        this(day, month, year); //calling the constructor
        this.event = event;
    }



    public void printDate(){
        System.out.println("Date: " + day + "/" + month + "/" + year + " --> " + event);
    }

    public static void main(String[] args) {
        TypesOfConstructor tc2 = new TypesOfConstructor(); //Default Constructor
        tc2.printDate();

        TypesOfConstructor tc = new TypesOfConstructor(7, 8, 2024); //Parameterized Constructor
        tc.printDate();

        TypesOfConstructor tc1 = new TypesOfConstructor(tc); //Copy Constructor
        tc1.printDate();

        TypesOfConstructor tc3 = new TypesOfConstructor(5, 4, 2001, "My Birthday"); //Chaining Constructor
        tc3.printDate();
    }
}
