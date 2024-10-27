package Task_2;

public abstract class Figure {
    private String color;
    private String borderColor;

    public Figure(String color, String borderColor) {
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
}
