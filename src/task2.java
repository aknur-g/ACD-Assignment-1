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

    public static void readArray(int[] arr, int index, Scanner sc) {
        if (index == arr.length) {
            return;
        }
        arr[index] = sc.nextInt();
        readArray(arr, index+1, sc);
    }

    public static int sumArray( int[] arr, int index){
        if (index == arr.length){
            return 0;
        }
        return arr[index] + sumArray(arr,index + 1);
    }
}
