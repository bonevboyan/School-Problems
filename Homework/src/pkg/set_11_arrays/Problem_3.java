package pkg.set_11_arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Problem_3 {
    public static void main(String[] args) {
        char[][] studentsAnswers = new char[8][10];

        for(int i = 0; i < studentsAnswers.length; i++){
            for (int j = 0; j < studentsAnswers[i].length; j++) {
                studentsAnswers[i][j] = (char) ('A' + (int) Math.floor(Math.random() * 4));
            }
        }

        char[] answerKey = new char[10];

        for (int i = 0; i < answerKey.length; i++) {
            answerKey[i] = (char) ('A' + (int) Math.floor(Math.random() * 4));
        }

        for(int i = 0; i < studentsAnswers.length; i++){
            int finalI = i;
            int correctAnswers = IntStream
                    .range(0, studentsAnswers[i].length)
                    .filter(index -> answerKey[index] == studentsAnswers[finalI][index])
                    .mapToObj(x -> studentsAnswers[finalI][x]).toList().size();

            System.out.printf("Student %d: %d out of 10%n", i, correctAnswers);
        }
    }
}
