package term_2.set_02_printf_enum;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.printf("i         m(i)\n%s\n", new String(new char[16]).replace("\0", "_"));
        for (int i = 1; i <= 1000; i+=100) {
            System.out.printf("%-4d%12.4f\n", i, calculate(i));
        }
    }

    public static double calculate(int n){
        double result = 0;

        for (int i = 1; i <= n; i++) {
            result += getElementN(i);
        }

        return 4 * result;
    }

    public static double getElementN(int n){
        return Math.pow(-1, n + 1) / (2 * n - 1);
    }
}
