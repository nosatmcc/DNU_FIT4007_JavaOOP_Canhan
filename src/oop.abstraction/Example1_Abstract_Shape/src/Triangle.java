import java.util.Scanner;

public class Triangle extends Shape {
    private float sideA, sideB, sideC;

    public Triangle() {
    }

    public Triangle(String color, float sideA, float sideB, float sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

    public float getSideC() {
        return sideC;
    }

    public void setSideC(float sideC) {
        this.sideC = sideC;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        color = sc.nextLine();
        System.out.print("Enter side A: ");
        sideA = sc.nextFloat();
        System.out.print("Enter side B: ");
        sideB = sc.nextFloat();
        System.out.print("Enter side C: ");
        sideC = sc.nextFloat();
    }

    @Override
    public float getArea() {
        float p = getPerimeter() / 2;
        return (float) Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public float getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public String toString() {
        return "Triangle [color=" + color + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC +
                ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
