package java_coding_problems_book.mathquestions;

public class DoubleOrFloatFiniteFloatingPointValue {
    public static void main(String[] args) {
        //For float
        //Math.abs(f) <= Float.MAX_VALUE;
        //For double
        //Math.abs(d) <= Double.MAX_VALUE;

        Float f1 = 4.5f;
        boolean f1f = Float.isFinite(f1);
        System.out.println(f1f);

        Float f2 = f1 / 0;
        boolean f2f = Float.isFinite(f2);
        System.out.println(f2f);

        Float f3 = 0f / 0f;
        boolean f3f = Float.isFinite(f3);
        System.out.println(f3f);

        Double d1 = 0.000333411333d;
        boolean d1f = Double.isFinite(d1);
        System.out.println(d1f);

        Double d2 = d1 / 0;
        boolean d2f = Double.isFinite(d2);
        System.out.println(d2f);

        Double d3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(d3);
        System.out.println(d3f);

    }
}
