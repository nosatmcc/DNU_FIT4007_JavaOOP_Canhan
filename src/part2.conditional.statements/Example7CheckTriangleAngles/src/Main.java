import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle a: ");
        int a = scanner.nextInt();
        System.out.print("Enter angle b: ");
        int b = scanner.nextInt();
        System.out.print("Enter angle c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("The numbers can be angles of a triangle.");
        } else {
            System.out.println("The numbers cannot be angles of a triangle.");
        }

        scanner.close();
    }
}
