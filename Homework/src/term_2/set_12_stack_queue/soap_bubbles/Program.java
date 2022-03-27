package term_2.set_12_stack_queue.soap_bubbles;

import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        Stack<ObjectType> objects = new Stack<>();
        objects.add(ObjectType.Empty);

        for (char ch : input.toCharArray()) {
            switch (ch){
                case 'O':
                    if(objects.peek() != ObjectType.UpPin){
                        objects.add(ObjectType.Bubble);
                    }
                    break;
                case 'T':
                    objects.add(ObjectType.UpPin);
                    break;
                case 'L':
                    if(objects.peek() == ObjectType.Bubble){
                        objects.pop();
                    }
                    objects.add(ObjectType.DownPin);
                    break;
                default:
                    break;
            }
        }
        System.out.println(objects.size() - 1);
    }
}
