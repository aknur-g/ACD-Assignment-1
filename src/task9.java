import java.util.Scanner;

public class task9 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int result = count(text, 0);

        System.out.println(result);
    }

    public static int count(String text, int n) {
        if (n == text.length()) {
            return 0;
        }

        return 1 + count(text, n + 1);
    }
}