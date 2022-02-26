package term_2.set_05_recursion;

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = input.nextInt();

        System.out.println("The moves are:");
        int moves = moveDisks(n, 'A', 'B', 'C', 0);
        System.out.println("Number of moves: " + moves);
    }

    public static int moveDisks(int n, char fromTower, char toTower, char auxTower, int moves) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            return 1;
        }
        else {
            int count1 = moveDisks(n-1, fromTower, auxTower, toTower, moves);
            System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
            int count2 = moveDisks(n-1, auxTower, toTower, fromTower, moves);
            return count1 + count2 + 1;
        }
    }
}
