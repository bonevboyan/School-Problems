package term_2.set_06_tail_recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        try{
            int n = new Scanner(System.in).nextInt();
            System.out.println(apple(n));
        }catch (InputMismatchException ex){
            System.out.println("Invalid input!");
        }
    }

    public static int apple(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else if (n % 3 == 0) {
            return 3 * apple(n / 3) + 1;
        } else if (n % 3 == 1) {
            return apple(n - 1) + 1;
        } else {
            return apple(n - 2) + 2;
        }
    }
}
