import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi a: ");
        String a = sc.nextLine();

        System.out.print("Nhập chuỗi b: ");
        String b = sc.nextLine();

        if (a.equals(b)) { // so sánh nội dung
            System.out.println("Hai chuỗi giống nhau.");
        } else {
            System.out.println("Hai chuỗi khác nhau.");
        }
    }
}
