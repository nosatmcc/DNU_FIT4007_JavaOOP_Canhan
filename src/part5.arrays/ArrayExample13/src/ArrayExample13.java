import java.util.Scanner;

public class ArrayExample13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        boolean ok = true;
        for (int i = 1; i < n; i++)
            if (a[i] < a[i - 1]) {
                ok = false;
                break;
            }
        System.out.println(ok ? "YES" : "NO");
    }
}
