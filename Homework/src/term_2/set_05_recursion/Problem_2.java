package term_2.set_05_recursion;

public class Problem_2 {
    public static void main(String[] args) {
        xMethod(1234567);
    }

    public static void xMethod(int n) {
        for (int i = n; i > 0; i /= 10) {
            System.out.print(i % 10);
        }
    }

}
