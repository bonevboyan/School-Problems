package pkg.statements;

import java.util.Scanner;

public class Problem_5_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("First rectangle upper left x:");
        int firstX1 = scanner.nextInt();

        System.out.println("First rectangle upper left y:");
        int firstY1 = scanner.nextInt();

        System.out.println("First rectangle down right x:");
        int firstX2 = scanner.nextInt();

        System.out.println("First rectangle down right y:");
        int firstY2 = scanner.nextInt();

        System.out.println("Second rectangle upper left x:");
        int secondX1 = scanner.nextInt();

        System.out.println("Second rectangle upper left y:");
        int secondY1 = scanner.nextInt();

        System.out.println("Second rectangle down right x:");
        int secondX2 = scanner.nextInt();

        System.out.println("Second rectangle down right y:");
        int secondY2 = scanner.nextInt();

        System.out.println(checkIfContained(firstX1, firstX2,firstY1, firstY2, secondX1, secondX2, secondY1, secondY2));

    }
    public static boolean checkIfContained(int firstX1, int firstX2, int firstY1, int firstY2, int secondX1, int secondX2, int secondY1, int secondY2) {
        if(firstX1 <= secondX1 && firstY1 >= secondY1 && firstX2 >= secondX2 && firstY2 <= secondY2){
            return true;
        }
        return false;
    }
}
