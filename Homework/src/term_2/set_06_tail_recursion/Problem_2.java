package term_2.set_06_tail_recursion;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.println(foo(500, 125));
    }

    //Euclidean Algorithm - finds the greatest common divisor between two numbers
    public static int foo (int x, int y) {
        if (y == 0)
            return x;
        else
            return foo(y, x % y);
    }

}
