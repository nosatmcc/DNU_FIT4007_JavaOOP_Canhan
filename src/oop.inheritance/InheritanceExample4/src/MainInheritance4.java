public class MainInheritance4 {
    public static void main(String[] args) {
        Square s = new Square(10);
        System.out.println(s);
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println("Area: " + s.getArea());
        s.setSide(20);
        System.out.println(s);
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println("Area: " + s.getArea());
        s.input();
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println("Area: " + s.getArea());
    }
}
