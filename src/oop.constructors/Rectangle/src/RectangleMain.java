public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(3.5);
        r1.setHeight(4.0);

        Rectangle r2 = new Rectangle(2.0, 5.0);

        System.out.println(r1.toString());
        System.out.println(r2.toString());
    }
}
