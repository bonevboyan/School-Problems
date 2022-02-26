package term_2.set_06_tail_recursion;

public class Problem_4 {
    public static void main(String[] args) {
        System.out.println(pow(5, 5, 1));
    }

    public static double pow(double num, int power, double value) {
        if (power == 0) {
            return value;
        }
        if (power == 1) {
            return value * num;
        } else if (power % 2 != 0) {
            return pow(num * num, (power - 1) / 2, value * num);
        } else {
            return pow(num * num, power / 2, value);
        }
    }
}
