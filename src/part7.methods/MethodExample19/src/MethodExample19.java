import java.util.Scanner;

public class MethodExample19 {
    public static boolean isPerfectSquare(int n) {
        int x = (int)Math.sqrt(n);
        return x * x == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n) ? "YES" : "NO");
    }
}
