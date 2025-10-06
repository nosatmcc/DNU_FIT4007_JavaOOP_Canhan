import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        float number = scanner.nextFloat();

        if (number == (int) number) {
            System.out.println(number + " is an integer.");
        } else {
            System.out.println(number + " is not an integer.");
        }

        scanner.close();
    }
}
