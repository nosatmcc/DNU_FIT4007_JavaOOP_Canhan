import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A')
                count++;
        System.out.println(count);
    }
}
