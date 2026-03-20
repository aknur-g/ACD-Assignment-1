import java.util.Scanner;

public class task4 {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);

        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return factorial(n - 1) * n;
    }
}
