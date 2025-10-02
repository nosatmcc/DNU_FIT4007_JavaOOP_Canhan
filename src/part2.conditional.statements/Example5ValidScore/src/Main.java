import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a score: ");
        int score = scanner.nextInt();

        if (score >= 0 && score <= 10) {
            System.out.println("The score is valid.");
        } else {
            System.out.println("The score is not valid.");
        }

        scanner.close();
    }
}
