import java.util.Scanner;

public class task5 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = fibonacci(n);

        System.out.println(result);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}