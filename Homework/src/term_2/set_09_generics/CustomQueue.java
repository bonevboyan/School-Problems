package term_2.set_09_generics;

import java.util.ArrayList;

public class CustomQueue<E> {
    private final ArrayList<E> queue;

    public CustomQueue() {
        queue = new ArrayList<>();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void enqueue(E item) {
        queue.add(item);
    }

    public E dequeue() {
        return queue.remove(0);
    }

    public E peek() {
        return queue.get(0);
    }
}