import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        switch (gender) {
            case 0: System.out.println("Nam"); break;
            case 1: System.out.println("Nữ"); break;
            case 2: System.out.println("Khác"); break;
            default: System.out.println("Không hợp lệ");
        }
    }
}
