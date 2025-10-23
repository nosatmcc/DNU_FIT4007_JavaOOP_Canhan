public class ShapeMain {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Enter triangle information:");
        t.input();
        System.out.println(t);

        Rectangle r = new Rectangle();
        System.out.println("Enter rectangle information:");
        r.input();
        System.out.println(r);
    }
}
