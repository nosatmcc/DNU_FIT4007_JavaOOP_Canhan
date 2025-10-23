import java.util.Scanner;

public class Rectangle extends Shape {
    private float width, height;

    public Rectangle() {
    }

    public Rectangle(String color, float width, float height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = sc.nextLine();
        System.out.print("Enter width: ");
        width = sc.nextFloat();
        System.out.print("Enter height: ");
        height = sc.nextFloat();
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle [color=" + color + ", width=" + width + ", height=" + height +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
