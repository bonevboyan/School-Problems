package term_1.set_13_string;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        System.out.println(input.equals(new StringBuilder(input).reverse().toString()));
    }
}
