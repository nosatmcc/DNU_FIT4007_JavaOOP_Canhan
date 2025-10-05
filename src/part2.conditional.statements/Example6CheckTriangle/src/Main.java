import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("The numbers can form a triangle.");
        } else {
            System.out.println("The numbers cannot form a triangle.");
        }

        scanner.close();
    }
}
