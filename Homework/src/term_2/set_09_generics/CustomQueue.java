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

    private void resize(int capacity) {
        this.capacity = capacity;

        ArrayList<E> copy = new ArrayList<E>(capacity);

        copy.addAll(queue);

        queue = copy;
    }

    public void enqueue(E item) {
        if (queue.size() == capacity) {
            resize(2 * queue.size());
        }

        queue.add(item);
    }

    public E dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }
        return queue.remove(0);
    }
}
