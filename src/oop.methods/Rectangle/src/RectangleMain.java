public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 5);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Is square: " + r.isSquare());
    }
}
