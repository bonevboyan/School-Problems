package term_2.set_12_stack_queue.lidl;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<Line> lines = new PriorityQueue<>();

        int numberOfClients = scanner.nextInt();
        int maxCapacity = scanner.nextInt();
        int linesCount = scanner.nextInt();

        for (int i = 0; i < linesCount; i++) {
            lines.add(new Line(i, maxCapacity));
        }

        for (int i = 0; i < numberOfClients; i++) {
            var line = lines.poll();

            line.addCount(i % maxCapacity + 1);
            lines.add(line);
        }

        ArrayList<List<Integer>> clientProducts = new ArrayList<>();

        for (int i = 0; i < linesCount; i++) {
            var line = lines.poll();

            while(clientProducts.size() <= line.getNumber()){
                clientProducts.add(new ArrayList<>());
            }

            clientProducts.set(line.getNumber(), line.getClients());
        }

        System.out.println(String.join("\n", clientProducts.stream().map(x -> x.stream().skip(1).map(Object::toString).collect(Collectors.joining(" "))).toList()));
    }
}