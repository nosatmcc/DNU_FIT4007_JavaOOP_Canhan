import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case 'N': System.out.println("Bắc"); break;
            case 'S': System.out.println("Nam"); break;
            case 'W': System.out.println("Tây"); break;
            case 'E': System.out.println("Đông"); break;
            default: System.out.println("Không hợp lệ");
        }
    }
}
