package term_2.set_02_printf_enum;

import java.util.Scanner;

public class Problem_3 {
    static void printBoard(char[][] field) {
        System.out.println("   0 1 2");
        for (int i = 0; i < field.length; i++) {
            System.out.printf("%2d", i);
            for (int j = 0; j < field[i].length; j++) {
                System.out.printf("%2c", field[i][j]);
            }
            System.out.println();
        }
    }

    static boolean checkIfGameHasEnded(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != '-') {
                return true;
            }
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != '-') {
                return true;
            }
        }

        if (field[1][1] == field[2][2] && field[0][0] == field[1][1] && field[1][1] != '-') {
            return true;
        }

        if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != '-') {
            return true;
        }
        return false;
    }

    static boolean checkIfTie(char[][] field) {
        for (var pos : field) {
            for (var ch : pos) {
                if (ch == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    static void printMessage(boolean isX) {
        if (isX) {
            System.out.println("X's turn!");
        } else {
            System.out.println("O's turn!");
        }
    }

    public static void main(String[] args) {
        char[][] field = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        boolean isX = true;

        while (true) {
            printBoard(field);
            printMessage(isX);

            System.out.print("Enter the X coordinate for your move: ");
            int x = Integer.parseInt(new Scanner(System.in).nextLine());

            if (x > 2 || x < 0) {
                System.out.println("Invalid input (x e [0, 2]).");
                continue;
            }

            System.out.print("Enter the Y coordinate for your move: ");
            int y = Integer.parseInt(new Scanner(System.in).nextLine());

            if (y > 2 || y < 0) {
                System.out.println("Invalid input (y e [0, 2]).");
                continue;
            }

            if (field[y][x] !='-')
            {
                System.out.println("This tile is already occupied.");
                continue;
            }

            field[y][x] = isX ? 'X' : 'O';

            if (checkIfGameHasEnded(field)) {
                printBoard(field);
                if (isX) {
                    System.out.println("X won!");
                } else {
                    System.out.println("O won!");
                }
                break;
            }
            if (checkIfTie(field)) {
                printBoard(field);
                System.out.println("Tie!");
                break;
            }
            isX = !isX;
        }
    }
}
