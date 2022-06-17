package term_2.set_19_exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] counter = new int[10];

        for (int i = 0; i < a; i++) {
            int number = scanner.nextInt();
            counter[number]++;
        }

        for (int i = 0; i < 10; i++) {
            if (counter[i] != 0) {
                System.out.println("chislo:" + i + " counter:" + counter[i]);
            }
        }
    }
}
