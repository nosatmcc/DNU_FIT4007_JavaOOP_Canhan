import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/':
                if (b != 0) System.out.println(a / b);
                else System.out.println("Lỗi chia cho 0");
                break;
            case '%':
                if (b != 0) System.out.println(a % b);
                else System.out.println("Lỗi chia cho 0");
                break;
            default: System.out.println("Phép toán không hợp lệ");
        }
    }
}
