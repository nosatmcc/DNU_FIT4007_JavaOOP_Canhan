import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer N: ");
        int N = sc.nextInt();

        if (N >= 0) {
            System.out.println(N + " is a natural number.");
        } else {
            System.out.println(N + " is not a natural number.");
        }

        sc.close();
    }
}
