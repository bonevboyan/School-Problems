package term_2.set_16_heap_sort;

public class HeapSort {

    /**
     * Heap sort method
     */
    public static <E extends Comparable<E>> void heapSort(E[] list) {
        // Create a Heap of integers
        Heap<E> heap = new Heap<>();

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

//    public static <E> void heapSort(E[] list, Comparator<? super E> comparator) {
//        Heap<E> heap = new Heap<>();
//
//        // Add elements to the heap
//        for (int i = 0; i < list.length; i++)
//            heap.add(list[i]);
//
//        // Remove elements from the heap
//        for (int i = list.length - 1; i >= 0; i--)
//            list[i] = heap.remove();
//    }

    /**
     * A test method
     */
    public static void main(String[] args) {
        Double[] list = {-44.0, -5.0, -3.0, 3.0, 3.0, 1.0, -4.0, 0.0, 1.0, 2.0, 4.0, 5.0, 53.0};
        heapSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}