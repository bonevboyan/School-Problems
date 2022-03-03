package term_2.set_09_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

public class Problem_1 {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8, -10, 10, 4};

        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(array).boxed().collect(Collectors.toList());

        shuffle(list);
        System.out.println(list);

        sort(list);
        System.out.println(list);

        Integer min = min(list);
        System.out.println(min);
    }

    public static <E> void shuffle(ArrayList<E> list) {
        Random r = new Random();

        for (int i = list.size() - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);

            E temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < (list.size() - i); j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    E temp = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                min = list.get(i);
            }
        }

        return min;
    }
}
