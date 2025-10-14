import java.util.Scanner;

public class Example7ReEnterUntilPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        do {
            N = sc.nextInt();
        } while (N <= 0);
        System.out.println("N = " + N);
    }
}
