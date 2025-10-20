import java.util.Scanner;

public class MethodExample2 {
    public static int product(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println(product(a, b, c));
    }
}
