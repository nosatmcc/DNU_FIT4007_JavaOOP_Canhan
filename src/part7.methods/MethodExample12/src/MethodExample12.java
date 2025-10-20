import java.util.Scanner;

public class MethodExample12 {
    public static void printNTimes(String s, int n) {
        for (int i = 0; i < n; i++) System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        printNTimes(s, n);
    }
}
