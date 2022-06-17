package term_2.set_19_exercises;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("file name:");
        String name = scanner.nextLine();
        System.out.println("K:");
        int K = scanner.nextInt();

        ArrayList<Integer> numbers = getNums(name);
        removeK(numbers, K);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    static void removeK(ArrayList<Integer> numbers, int K) {
        for (int i = 0; i < numbers.size(); i++) {
            if (findSum(numbers.get(i)) % K == 0) {
                numbers.remove(i);
                i--;
            }
        }
        sort(numbers);
    }

    static void sort(ArrayList<Integer> numbers) {
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return findSum(o1) - findSum(o2);
            }
        });
    }

    static int findSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    static ArrayList<Integer> getNums(String name) {
        try {
            Scanner scanner = new Scanner(new File("src\\exercises\\" + name + ".txt"));
            ArrayList<Integer> ints = new ArrayList<>();
            while (scanner.hasNextLine()) {
                int num = Integer.parseInt(scanner.nextLine());
                ints.add(num);
            }
            return ints;
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}
