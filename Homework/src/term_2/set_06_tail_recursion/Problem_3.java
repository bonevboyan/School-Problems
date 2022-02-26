package term_2.set_06_tail_recursion;

public class Problem_3 {
    public static void main(String[] args) {
        System.out.println("Sum is " + xMethod(5));
    }

    //return the sum of numbers in the range [1, n]
    public static int xMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);
    }
}
