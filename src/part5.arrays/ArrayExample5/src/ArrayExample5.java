import java.util.Scanner;

public class ArrayExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 1; i < n; i += 2)
            if (a[i] % 2 == 0) sum += a[i];
        System.out.println(sum);
    }
}
