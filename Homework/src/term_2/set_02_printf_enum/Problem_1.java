package term_2.set_02_printf_enum;

public class Problem_1 {
    public static void main(String[] args) {
        System.out.printf("i         m(i)\n%s\n", new String(new char[16]).replace("\0", "_"));
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-4d%12.4f\n", i, calculate(i));
        }
    }

    public static double calculate(int n){
        double result = 0;

        for (int i = 1; i <= n; i++) {
            result += getElementN(i);
        }

        return result;
    }

    public static double getElementN(int n){
        return 1.0 * n/(n + 2);
    }
}
