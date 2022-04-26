package term_2.set_15_sorting_algorithms.merge_and_quick_sort;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] a = {5, 25, 1, -5, 76, 3, 43};
        mergeSort(a, 0, a.length - 1, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.asList(a));
    }

    public static <T> void mergeSort(T[] array, int from, int to, Comparator<? super T> comp)
    {
        if (from == to)
            return;
        int mid = (from + to) / 2;
        // Sort the first and the second half
        mergeSort(array, from, mid, comp);
        mergeSort(array, mid + 1, to, comp);
        merge(array, from, mid, to, comp);
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] array, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;

            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);

            merge(array, start, middle, end);
        }
    }

    private static <E> void merge(E[] a, int from, int mid, int to, Comparator<? super E> comp) {
        int n = to - from + 1;
        Object[] values = new Object[n];

        int fromValue = from;

        int middleValue = mid + 1;

        int index = 0;

        while (fromValue <= mid && middleValue <= to) {
            if (comp.compare(a[fromValue], a[middleValue]) < 0) {
                values[index] = a[fromValue];
                fromValue++;
            } else {
                values[index] = a[middleValue];
                middleValue++;
            }
            index++;
        }

        while (fromValue <= mid) {
            values[index] = a[fromValue];
            fromValue++;
            index++;
        }
        while (middleValue <= to) {
            values[index] = a[middleValue];
            middleValue++;
            index++;
        }

        for (index = 0; index < n; index++)
            a[from + index] = (E) values[index];
    }

    public static <T extends Comparable<? super T>> void merge(T[] array, int start, int middle, int end) {
        T[] leftArray = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];

        for (int i = 0; i < leftArray.length; ++i)
            leftArray[i] = array[start + i];

        for (int i = 0; i < rightArray.length; ++i)
            rightArray[i] = array[middle + 1 + i];

        int leftIndex = 0, rightIndex = 0;

        int currentIndex = start;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0) {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        while (leftIndex < leftArray.length) array[currentIndex++] = leftArray[leftIndex++];

        while (rightIndex < rightArray.length) array[currentIndex++] = rightArray[rightIndex++];
    }

}
