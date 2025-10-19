import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(reversed))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
