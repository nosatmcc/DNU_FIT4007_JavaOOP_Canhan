import java.util.Scanner;

public class MethodExample14 {
    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(toBinary(n));
    }
}
