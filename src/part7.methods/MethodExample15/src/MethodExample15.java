import java.util.Scanner;

public class MethodExample15 {
    public static int sumArray(int[] a) {
        int sum = 0;
        for (int x : a) sum += x;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(sumArray(a));
    }
}
