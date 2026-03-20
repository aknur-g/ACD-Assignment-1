import java.util.Scanner;

public class task2 {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        readArray(arr, 0, sc);

        int sum = sumArray(arr, 0);
        double avg = (double) sum / n;

        System.out.println(avg);
    }
    public static void readArray(int[] arr, int n, Scanner sc) {
        if (n == arr.length) {
            return;
        }
        arr[n] = sc.nextInt();
        readArray(arr, n  + 1, sc);
    }

    public static int sumArray(int[] arr, int n) {
        if (n == arr.length) {
            return 0;
        }
        return arr[n] + sumArray(arr, n + 1);
    }
}
