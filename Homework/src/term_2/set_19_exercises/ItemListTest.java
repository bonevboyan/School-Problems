package term_2.set_19_exercises;

import java.util.Scanner;

public class ItemListTest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ItemList itemList = new ItemList();

        for (int i = 0; i < N; i++) {
            try {
                System.out.println("description:");
                String description = scanner.next();
                System.out.println("price:");
                double price = scanner.nextDouble();

                Item item = new Item(description, price);
                itemList.add(item);
            } catch (Exception ex) {
                System.out.println("Invalid input");
                i--;
            }
        }

        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i).toString());
        }
    }
}
