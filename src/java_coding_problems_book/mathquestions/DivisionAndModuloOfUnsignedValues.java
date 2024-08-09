package java_coding_problems_book.mathquestions;

public class DivisionAndModuloOfUnsignedValues {
    public static void main(String[] args) {
        int divisionSignedMinMax = Integer.MIN_VALUE / Integer.MAX_VALUE;
        System.out.println(divisionSignedMinMax);

        int divisionSignedMinMax1 = Integer.MAX_VALUE / Integer.MIN_VALUE;
        System.out.println(divisionSignedMinMax1);

        int moduloSignedMinMax = Integer.MIN_VALUE % Integer.MAX_VALUE;
        System.out.println(moduloSignedMinMax);

        int moduloSignedMinMax1 = Integer.MAX_VALUE % Integer.MIN_VALUE;
        System.out.println(moduloSignedMinMax1);

        int divisionSignedMinMax2 = Integer.divideUnsigned(Integer.MIN_VALUE , Integer.MAX_VALUE);
        System.out.println(divisionSignedMinMax2);

        int divisionSignedMinMax12 = Integer.divideUnsigned(Integer.MAX_VALUE , Integer.MIN_VALUE);
        System.out.println(divisionSignedMinMax12);

        int moduloSignedMinMax2 = Integer.remainderUnsigned(Integer.MIN_VALUE , Integer.MAX_VALUE);
        System.out.println(moduloSignedMinMax2);

        int moduloSignedMinMax12 = Integer.remainderUnsigned(Integer.MAX_VALUE , Integer.MIN_VALUE);
        System.out.println(moduloSignedMinMax12);
    }
}
