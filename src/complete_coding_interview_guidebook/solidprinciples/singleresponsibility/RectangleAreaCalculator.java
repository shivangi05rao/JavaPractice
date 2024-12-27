package complete_coding_interview_guidebook.solidprinciples.singleresponsibility;
//SRP
public class RectangleAreaCalculator {
    private static final double INCH_TERM = 0.0254d;

    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //follows SRP
    public int area() {
        return width * height;
    }

    //this method breaks SRP
    //create another class for this
//    public double metersToInches(int area) {
//        return area / INCH_TERM;
//    }
}
