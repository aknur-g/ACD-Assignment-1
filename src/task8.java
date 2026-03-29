
import java.util.Scanner;

public class task8 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        if (checkDigits(s, 0)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }

    public static boolean checkDigits(String s, int index){
        if (index == s.length()){
            return true;
        }

        if (!Character.isDigit(s.charAt(index))){
            return false;
        }
        return checkDigits(s, index+1);
    }
}