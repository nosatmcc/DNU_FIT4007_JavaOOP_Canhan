import java.util.Scanner;

public class MethodExample3 {
    public static boolean isNatural(int n) {
        return n >= 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isNatural(n) ? "YES" : "NO");
    }
}
