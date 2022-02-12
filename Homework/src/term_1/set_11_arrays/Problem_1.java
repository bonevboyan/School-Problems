package term_1.set_11_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        List<Integer> solution = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            solution.add(new Scanner(System.in).nextInt());
        }
        Collections.shuffle(solution);
        solution.forEach(x -> System.out.print(x + " "));
    }
}
