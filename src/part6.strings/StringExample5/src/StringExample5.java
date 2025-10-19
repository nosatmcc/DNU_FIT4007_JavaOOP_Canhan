import java.util.Scanner;

public class StringExample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean hasDigit = false;
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))) {
                hasDigit = true;
                break;
            }
        System.out.println(hasDigit ? "YES" : "NO");
    }
}
