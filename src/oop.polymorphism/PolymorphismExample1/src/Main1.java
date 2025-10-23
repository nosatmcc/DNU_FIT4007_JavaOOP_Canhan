public class Main1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        System.out.println(s);
        s.incAge(2);
        System.out.println("After increase age: " + s);
    }
}
