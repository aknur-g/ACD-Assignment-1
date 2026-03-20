import java.util.Scanner;

public class Task1 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        showDigits(number);
    }

    public static void showDigits(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }

        showDigits(number / 10);
        System.out.println(number % 10);
    }
}