package Task_2;

public interface Calculation {
    default double calculatePerimeter(){
        return 0;
    }
    default double calculateArea(){
        return 0;
    }
}
