import java.util.Scanner;
public class Example15SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) sum += i * (i + 1);
        System.out.println(sum);
    }
}
