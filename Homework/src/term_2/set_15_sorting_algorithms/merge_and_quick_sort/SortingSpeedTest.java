package term_2.set_15_sorting_algorithms.merge_and_quick_sort;

import java.time.Duration;
import java.time.Instant;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortingSpeedTest {
    public static void main(String[] args) {
        test(50000);
        test(100000);
        test(150000);
        test(200000);
        test(250000);
        test(300000);
    }

    public static void test(int count){
        System.out.println("Array with " + count + " elements: ");
        System.out.println("---------------------------------------------");
        List<Integer> nums = IntStream.range(1, count).boxed().collect(Collectors.toList());
        Collections.shuffle(nums);

        int[] a = nums.stream().mapToInt(i->i).toArray();
        Instant starts = Instant.now();
        mergeSort(a);
        Instant ends = Instant.now();
        System.out.println("merge sort: " + Duration.between(starts, ends));

        a = nums.stream().mapToInt(i->i).toArray();
        starts = Instant.now();
        bubbleSort(a);
        ends = Instant.now();
        System.out.println("bubble sort: " + Duration.between(starts, ends));

        a = nums.stream().mapToInt(i->i).toArray();
        starts = Instant.now();
        selectionSort(a);
        ends = Instant.now();
        System.out.println("selection sort: " + Duration.between(starts, ends));

        a = nums.stream().mapToInt(i->i).toArray();
        starts = Instant.now();
        quickSort(a);
        ends = Instant.now();
        System.out.println("quick sort: " + Duration.between(starts, ends));

        System.out.println();
    }

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);
            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2[current2])
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }
        while (current1 < list1.length)
            temp[current3++] = list1[current1++];
        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    public static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    public static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;
        while (high > low) {
            while (low <= high && list[low] <= pivot)
                low++;
            while (low <= high && list[high] > pivot)
                high--;
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > first && list[high] >= pivot)
            high--;
        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void bubbleSort(int[] list) {
        for (int k = 0; k < list.length - 1; k++) {
            for (int i = 0; i < list.length - 1 - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
}
