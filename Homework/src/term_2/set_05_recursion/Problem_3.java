package term_2.set_05_recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("x: ");
            double x = scanner.nextDouble();
            System.out.print("n: ");
            int n = scanner.nextInt();

            System.out.printf("%.2f ^ %d = %.2f\n", x, n, pow(x, n));
            System.out.printf("%.2f ^ %d = %.2f\n", x, n, powRecursive(x, n));

        } catch (InputMismatchException ex) {
            System.out.println("Invalid input!");
        }
    }

    public static double pow(double x, int n) {
        double result = 1;

        for (int i = 0; i < n; i++) {
            result *= x;
        }

        return result;
    }

    public static double powRecursive(double x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * powRecursive(x, n - 1);
    }
}
