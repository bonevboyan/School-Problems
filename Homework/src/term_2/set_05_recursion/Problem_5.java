package term_2.set_05_recursion;

public class Problem_5 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d(base 10) = %s(base 2)\n", i, dec2Bin(i));
        }
    }

    public static String dec2Bin(int value) {
        if (value == 1) {
            return "1";
        } else if (value == 0) {
            return "0";
        }

        String newDigit = value % 2 == 0 ? "0" : "1";
        return dec2Bin(value / 2) + newDigit;
    }
}
