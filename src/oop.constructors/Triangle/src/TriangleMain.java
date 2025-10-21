public class TriangleMain {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.setSideA(3);
        t1.setSideB(4);
        t1.setSideC(5);

        Triangle t2 = new Triangle(2.5, 2.5, 3.0);

        System.out.println(t1.toString());
        System.out.println(t2.toString());
    }
}
