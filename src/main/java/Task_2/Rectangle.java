package Task_2;

public class Rectangle extends Figure implements Calculation{
    private double width;
    private double height;

    public Rectangle(String color, String borderColor, double width, double height) {
        super(color, borderColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
