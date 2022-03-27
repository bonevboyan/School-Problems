package term_2.set_12_stack_queue.sport;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        Stack<Direction> students = new Stack<>();
        students.add(Direction.Empty);

        for (char ch : input.toCharArray()) {
            switch (ch) {
                case 'L':
                    if (students.peek() == Direction.Rigth) {
                        students.pop();
                    }else{
                        students.add(Direction.Left);
                    }
                    break;
                case 'R':
                    students.add(Direction.Rigth);
                    break;
                default:
                    break;
            }
        }
        System.out.println(students.size() - 1);
    }
}
