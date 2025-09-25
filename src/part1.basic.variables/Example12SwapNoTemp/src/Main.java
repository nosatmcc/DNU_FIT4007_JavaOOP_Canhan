import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = scanner.nextInt();
        System.out.print("Enter integer b: ");
        int b = scanner.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);

        scanner.close();
    }
}
