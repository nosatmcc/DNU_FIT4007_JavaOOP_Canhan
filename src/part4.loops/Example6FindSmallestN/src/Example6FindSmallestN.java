import java.util.Scanner;

public class Example6FindSmallestN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int sum = 0, N = 0;
        while (sum + (N + 1) <= S) {
            N++;
            sum += N;
        }
        System.out.println(N);
    }
}
