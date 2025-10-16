import java.util.Scanner;
public class Example12CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean prime = N > 1;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "YES" : "NO");
    }
}
