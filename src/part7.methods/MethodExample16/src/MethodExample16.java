import java.util.Scanner;

public class MethodExample16 {
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i * i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfSquares(n));
    }
}
