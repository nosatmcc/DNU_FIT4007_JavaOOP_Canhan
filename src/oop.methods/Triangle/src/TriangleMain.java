public class TriangleMain {
    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println(t);
        System.out.println("Valid: " + t.isValid());
        System.out.println("Type: " + t.getType());
        System.out.println("Area: " + t.getArea());
        System.out.println("Perimeter: " + t.getPerimeter());
    }
}
