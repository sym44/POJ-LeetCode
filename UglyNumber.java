import java.util.ArrayList;
import java.util.List;

/**
 * Created by sym44 on 10/7/2015.
 */
public class UglyNumber {
    public static void main(String[] args){
        int number = 19;

        System.out.print(isUgly(number));
    }

    public static boolean isUgly(int num){
        // when the number is 1, typically treat it as an ugly number
        if(num == 1) return true;
        if(num <= 0) return false;

        // otherwise
        while (factor(num, 5) == true) {
            num /= 5;
        }
        while (factor(num, 3) == true) {
            num /= 3;
        }
        while (factor(num, 2) == true) {
            num /= 2;
        }
        if(num == 1) return true;
        return false;
    }

    public static boolean factor(int num, int factor) {
        if (num % factor == 0)
            return true;
        return false;
    }
}
