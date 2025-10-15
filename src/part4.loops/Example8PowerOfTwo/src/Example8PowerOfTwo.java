import java.util.Scanner;
public class Example8PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean powerOfTwo = true;
        if (N < 1) powerOfTwo = false;
        else {
            while (N % 2 == 0) N /= 2;
            if (N != 1) powerOfTwo = false;
        }
        System.out.println(powerOfTwo ? "YES" : "NO");
    }
}
