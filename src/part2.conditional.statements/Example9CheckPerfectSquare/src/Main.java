import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();

        if (N > 0) {
            int sqrtN = (int) Math.sqrt(N);
            if (sqrtN * sqrtN == N) {
                System.out.println(N + " is a perfect square.");
            } else {
                System.out.println(N + " is not a perfect square.");
            }
        } else {
            System.out.println("N must be a positive integer.");
        }

        scanner.close();
    }
}
