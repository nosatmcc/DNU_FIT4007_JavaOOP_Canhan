import java.util.Scanner;
public class Example9Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= N; i++) fact *= i;
        System.out.println(fact);
    }
}
