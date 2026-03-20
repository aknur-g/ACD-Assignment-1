import java.util.Scanner;

public class task7 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        reverse(n, sc);
    }

    public static void reverse(int n, Scanner sc) {
        if (n == 0) {
            return;
        }

        int number = sc.nextInt();
        reverse(n - 1, sc);
        System.out.print(number + " ");
    }
}