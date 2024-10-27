package Task_2;

public class Circle extends Figure implements Calculation{
    private double radius;

    public Circle(String color, String borderColor, double radius) {
        super(color, borderColor);
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
