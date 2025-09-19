import java.util.Scanner;

public class ViDu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu

        System.out.print("Nhập số nguyên a: ");
        int a = sc.nextInt(); // Nhập số nguyên a

        System.out.print("Nhập số nguyên b: ");
        int b = sc.nextInt(); // Nhập số nguyên b

        // Thực hiện các phép tính cơ bản
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuongNguyen = a / b; // phép chia lấy phần nguyên
        double thuongThuc = (double) a / b; // ép kiểu để lấy kết quả số thực

        // In kết quả ra màn hình
        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương (nguyên) = " + thuongNguyen);
        System.out.println("Thương (thực) = " + thuongThuc);
    }
}
