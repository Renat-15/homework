package Task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", "Black", 5);

        System.out.println("Круг: ");
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println("Цвет фона: " + circle.getColor());
        System.out.println("Цвет границ: " + circle.getBorderColor());
        System.out.println();

        Rectangle rectangle = new Rectangle("White", "Pink", 5, 5);
        System.out.println("Прямоугольник: ");
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        System.out.println("Цвет фона: " + rectangle.getColor());
        System.out.println("Цает границ: " + rectangle.getBorderColor());
        System.out.println();

        Triangle triangle = new Triangle("Black", "Green", 10, 10, 10);
        System.out.println("Треугольник: ");
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println("Цвет фона: " + triangle.getColor());
        System.out.println("Цвет границ: " + triangle.getBorderColor());
    }
}
