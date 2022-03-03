package term_2.set_08_stack_queue;

public class QueueOfIntegers {
    private static final int INIT_CAPACITY = 8;

    private int[] queue;
    private int size;

    public QueueOfIntegers() {
        queue = new int[INIT_CAPACITY];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize(int capacity) {
        int[] copy = new int[capacity];

        if (size >= 0) System.arraycopy(queue, 0, copy, 0, size);

        queue = copy;
    }

    public void enqueue(int item) {
        if (size == queue.length) {
            resize(2 * queue.length);
        }

        queue[size] = item;

        size++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!");
        }

        int item = queue[0];

        System.arraycopy(queue, 1, queue, 0, queue.length - 1);

        size--;

        return item;
    }

}
