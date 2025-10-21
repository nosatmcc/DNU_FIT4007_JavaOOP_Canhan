public class CircleMain {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(1.5);

        Circle c2 = new Circle(2.5);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
