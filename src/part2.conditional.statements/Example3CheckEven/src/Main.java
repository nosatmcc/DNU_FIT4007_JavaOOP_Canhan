import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();

        if (N % 2 == 0) {
            System.out.println(N + " is an even number.");
        } else {
            System.out.println(N + " is an odd number.");
        }

        scanner.close();
    }
}
