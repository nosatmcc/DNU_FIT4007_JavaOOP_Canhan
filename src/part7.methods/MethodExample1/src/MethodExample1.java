import java.util.Scanner;

public class MethodExample1 {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(sum(a, b));
    }
}
