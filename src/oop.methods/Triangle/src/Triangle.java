public class Triangle {
    private double a, b, c;

    public Triangle() {}

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public boolean isValid() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String getType() {
        if (!isValid()) return "Not a triangle";
        if (a == b && b == c) return "Equilateral";
        else if (a == b || b == c || a == c) return "Isosceles";
        else return "Scalene";
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
