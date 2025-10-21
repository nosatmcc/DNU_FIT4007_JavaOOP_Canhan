public class SquareMain {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(4.0);

        Square s2 = new Square(6.0);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
