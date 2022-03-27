package term_2.set_12_stack_queue.kat_land;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalDistance = Double.parseDouble(scanner.nextLine());
        double drivenDistance = 0;

        Stack<Double> speeds = new Stack<>();
        speeds.add(80.0);

        double time = 0;

        do {
            var input = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .filter(x -> !x.equals(""))
                    .map(Double::parseDouble)
                    .limit(2)
                    .toList();

            var inputDistance = input.get(0);
            var inputSpeed = input.get(1);

            if(inputDistance > totalDistance || inputDistance < drivenDistance){
                continue;
            }

            var previous = 1.0;

            if (inputSpeed != -1) {
                previous = speeds.peek();
                speeds.add(inputSpeed);
            } else {
                previous = speeds.pop();
            }
            time += (inputDistance - drivenDistance) / previous;
            drivenDistance = inputDistance;
            System.out.println(time);
        } while (speeds.size() != 1);

        time += (totalDistance - drivenDistance) / speeds.pop();

        System.out.println(time);
    }
}
