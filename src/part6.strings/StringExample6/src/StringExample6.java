import java.util.Scanner;

public class StringExample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        boolean[] letters = new boolean[26];
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' && !letters[c - 'a']) {
                letters[c - 'a'] = true;
                count++;
            }
        }
        System.out.println(count == 26 ? "YES" : "NO");
    }
}
