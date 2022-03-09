package term_2.set_09_generics;

import java.util.ArrayList;

public class CustomQueue<E> {
    private static final int INIT_CAPACITY = 8;

    private ArrayList<E> queue;
    private int capacity;

    public CustomQueue() {
        capacity = INIT_CAPACITY;
        queue = new ArrayList<E>(capacity);
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
