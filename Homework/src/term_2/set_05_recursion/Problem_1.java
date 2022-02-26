package term_2.set_05_recursion;

public class Problem_1 {
    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
    }

    public static int xMethod(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
