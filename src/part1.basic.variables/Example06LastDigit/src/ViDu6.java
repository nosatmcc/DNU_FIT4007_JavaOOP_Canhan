import java.util.Scanner;

public class ViDu6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        int lastDigit = Math.abs(n % 10);

        // In kết quả
        System.out.println("Chữ số cuối cùng của " + n + " là: " + lastDigit);

        sc.close();
    }
}
