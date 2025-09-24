import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        System.out.print("Nhập số c: ");
        int c = sc.nextInt();

        // Kiểm tra: b là ước của a (a % b == 0) và b là bội của c (b % c == 0)
        if (a % b == 0 && b % c == 0) {
            System.out.println("b đồng thời là ước của a và là bội của c.");
        } else {
            System.out.println("Điều kiện không thỏa mãn.");
        }
    }
}
