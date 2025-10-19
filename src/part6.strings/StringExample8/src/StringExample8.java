import java.util.Scanner;

public class StringExample8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 1; i <= n; i++) {
            s += "*";
            System.out.println(s);
        }
    }
}
