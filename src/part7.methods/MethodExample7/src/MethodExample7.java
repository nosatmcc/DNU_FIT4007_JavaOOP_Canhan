import java.util.Scanner;

public class MethodExample7 {
    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        greet(name);
    }
}
