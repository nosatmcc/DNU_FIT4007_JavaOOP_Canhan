import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();

        if (length == width) {
            System.out.println("This is a square.");
        } else {
            System.out.println("This is not a square.");
        }

        sc.close();
    }
}
