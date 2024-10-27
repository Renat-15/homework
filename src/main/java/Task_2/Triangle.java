package Task_2;

public class Triangle extends Figure implements Calculation{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, String borderColor, double sideA, double sideB, double sideC) {
        super(color, borderColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
