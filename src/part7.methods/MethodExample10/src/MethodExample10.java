import java.util.Scanner;

public class MethodExample10 {
    public static boolean isPangram(String s) {
        boolean[] seen = new boolean[26];
        s = s.toLowerCase();
        for (char c : s.toCharArray()) if (c >= 'a' && c <= 'z') seen[c - 'a'] = true;
        for (boolean b : seen) if (!b) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPangram(s) ? "YES" : "NO");
    }
}
