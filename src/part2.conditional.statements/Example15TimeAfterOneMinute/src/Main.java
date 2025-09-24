import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giờ (0-23): ");
        int h = sc.nextInt();

        System.out.print("Nhập phút (0-59): ");
        int m = sc.nextInt();

        // Tăng 1 phút
        m++;
        if (m == 60) {  // nếu phút = 60 thì tăng giờ, reset phút = 0
            m = 0;
            h++;
            if (h == 24) { // nếu giờ = 24 thì reset về 0
                h = 0;
            }
        }

        System.out.println("Thời gian sau 1 phút nữa: " + h + ":" + (m < 10 ? "0" + m : m));
    }
}
