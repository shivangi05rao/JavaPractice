package java_coding_problems_book.stringsquestion;

public class ConvertingStringToIntLongFloatDouble {
    private static final String TO_INT = "453";
    private static final String TO_LONG = "12347654323";
    private static final String TO_FLOAT = "45.498F";
    private static final String TO_DOUBLE = "13.45679D";

    //converting String to int, long, float, double
    int toInt = Integer.parseInt(TO_INT);
    long toLg = Long.parseLong(TO_LONG);
    float toFt = Float.parseFloat(TO_FLOAT);
    double toDou = Double.parseDouble(TO_DOUBLE);

    //accomplishing objects
    Integer toInteger = Integer.valueOf(TO_INT);
    Long toLong = Long.valueOf(TO_LONG);
    Float toFloat = Float.valueOf(TO_FLOAT);
    Double toDouble = Double.valueOf(TO_DOUBLE);

    public static void main(String[] args) {
        ConvertingStringToIntLongFloatDouble converter = new ConvertingStringToIntLongFloatDouble();

        //Print converted primitive values
        System.out.println("Converted int: " + converter.toInt);
        System.out.println("Converted float: " + converter.toLg);
        System.out.println("Converted long: " + converter.toFt);
        System.out.println("Converted double: " + converter.toDou);

        //Print wrapper class values
        System.out.println("Wrapper Integer: " + converter.toInteger);
        System.out.println("Wrapper Long " + converter.toLong);
        System.out.println("Wrapper Float: " + converter.toFloat);
        System.out.println("Wrapper Double: " + converter.toDouble);
    }
}
