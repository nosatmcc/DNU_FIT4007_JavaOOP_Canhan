import java.util.Scanner;

public class ViDu7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên N (có ít nhất 2 chữ số): ");
        int n = sc.nextInt();
        n = Math.abs(n);
        int ganCuoi = (n / 10) % 10;
        System.out.println("Chữ số gần cuối của N là: " + ganCuoi);
        sc.close();
    }
}
