package term_2.set_08_stack_queue;

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        StackOfChars stackOfChars = new StackOfChars(input.length());

        int isValid = 0;

        loop:
        for (char c : input.toCharArray()) {
            switch (c) {
                case '[':
                case '(':
                case '{':
                    isValid += 1;
                    stackOfChars.push(c);
                    break;
                case ']':
                    if (stackOfChars.empty() || stackOfChars.peek() != '[') {
                        isValid = 100;
                        break loop;
                    } else {
                        isValid -= 1;
                        stackOfChars.pop();
                    }
                    break;
                case '}':
                    if (stackOfChars.empty() || stackOfChars.peek() != '{') {
                        isValid = 100;
                        break loop;
                    } else {
                        isValid -= 1;
                        stackOfChars.pop();
                    }
                    break;
                case ')':
                    if (stackOfChars.empty() || stackOfChars.peek() != '(') {
                        isValid = 100;
                        break loop;
                    } else {
                        isValid -= 1;
                        stackOfChars.pop();
                    }
                    break;
            }
        }

        if (isValid == 0) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }
    }
}
