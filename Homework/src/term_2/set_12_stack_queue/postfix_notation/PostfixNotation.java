package term_2.set_12_stack_queue.postfix_notation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostfixNotation {
    public static void main(String[] args) {
        System.out.println(evaluateEquation("100 200 + 2 / 5 * 7 +"));
        System.out.println(infixToPostFix("5+3*(3^4-1)"));
    }

    public static Integer evaluateEquation(String equation) {
        Stack<Integer> numbers = new Stack<>();

        for (String symbol : equation.split(" ")) {
            try {
                Integer number = Integer.parseInt(symbol);
                numbers.push(number);
            } catch (Exception ex) {
                if (numbers.size() != 2) {
                    throw new IllegalArgumentException("Invalid input!");
                }

                int num1 = numbers.pop();
                int num2 = numbers.pop();

                switch (symbol) {
                    case "+" -> numbers.push(num2 + num1);
                    case "-" -> numbers.push(num2 - num1);
                    case "/" -> numbers.push(num2 / num1);
                    case "*" -> numbers.push(num2 * num1);
                    default -> throw new IllegalArgumentException("Invalid input!");
                }
            }
        }

        return numbers.pop();
    }

    public static int priority(char c) {
        return switch (c) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static String infixToPostFix(String expression) {
        List<String> result = new ArrayList<String>();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (priority(c) > 0) {
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(c)) {
                    result.add(stack.pop() + "");
                }

                stack.push(c);
            } else if (c == ')') {
                char x = stack.pop();

                while (x != '(') {
                    result.add(x + "");
                    x = stack.pop();
                }
            } else if (c == '(') {
                stack.push(c);
            } else {
                result.add(c + "");
            }
        }

        for (int i = 0; i <= stack.size(); i++) {
            result.add(stack.pop() + "");
        }

        return String.join(" ", result);
    }
}