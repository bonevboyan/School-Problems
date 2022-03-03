package term_2.set_09_generics;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_2 {
    public static void main(String[] args) throws Exception {
        CustomQueue<Integer> queue = new CustomQueue<>();

        IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList()).forEach(queue::enqueue);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
