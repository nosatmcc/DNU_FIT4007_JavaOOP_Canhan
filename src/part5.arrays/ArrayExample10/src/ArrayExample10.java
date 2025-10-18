import java.util.Scanner;

public class ArrayExample10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            if (a[i] % 5 == 0) {
                System.out.print(a[i] + " ");
                count++;
            }
        if (count == 0) System.out.println("Không tồn tại phần tử nào chia hết cho 5");
    }
}
