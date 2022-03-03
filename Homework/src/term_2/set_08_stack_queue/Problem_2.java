package term_2.set_08_stack_queue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_2 {
    public static void main(String[] args) throws Exception {
        QueueOfIntegers queue = new QueueOfIntegers();

        IntStream.rangeClosed(1, 100).boxed().collect(Collectors.toList()).forEach(queue::enqueue);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
