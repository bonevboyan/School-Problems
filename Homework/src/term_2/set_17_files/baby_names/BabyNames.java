package term_2.set_17_files.baby_names;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BabyNames {
    public static void main(String[] args) {
        ArrayList<Year> years = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            String filename = String.format("C:\\Users\\PC\\source\\repos\\School-Problems\\Homework\\src\\term_2\\set_17_files\\files\\babynamesranking%d.txt", 2000 + i);
            File file = new File(filename);

            try {
                Scanner input = new Scanner(file);

                ArrayList<Name> names = new ArrayList<>();

                while (input.hasNextLine()) {
                    String[] tokens = input.nextLine().split("\\s+");

                    names.add(new Name(tokens[1], "M", Integer.parseInt(tokens[2]), Integer.parseInt(tokens[0])));
                    names.add(new Name(tokens[3], "F", Integer.parseInt(tokens[4]), Integer.parseInt(tokens[0])));
                }
                input.close();

                years.add(new Year(2000 + i, names));
            } catch (Exception ex) {
                System.out.println("Unhandled exception");
            }
        }

        System.out.println(summary(years));
    }

    public static String summary(ArrayList<Year> years) {
        Collections.reverse(years);
        StringBuilder sb = new StringBuilder();

        sb.append("Year Rank 1     Rank 2     Rank 3     Rank 4     Rank 5     Rank 1     Rank 2     Rank 3     Rank 4     Rank 5     ").append("\n");
        for (var year : years) {
            sb.append(String.format("%d %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s", year.year,
                    year.names.get(1).name, year.names.get(3).name, year.names.get(5).name, year.names.get(7).name, year.names.get(9).name,
                    year.names.get(0).name, year.names.get(2).name, year.names.get(4).name, year.names.get(6).name, year.names.get(8).name)).append("\n");
        }

        return sb.toString();
    }

    public static void searchName(ArrayList<Year> years) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the gender: ");
        String gender = (scanner.nextLine());

        System.out.print("Enter the name: ");
        String name = (scanner.nextLine());

        try {
            Name result = years.stream().filter(x -> x.year == year).findFirst().orElse(null).names.stream().filter(x -> x.name.equals(name) && x.gender.equals(gender)).findFirst().orElse(null);
            System.out.printf("%s is ranked #%d in year %d", result.name, result.rank, year);
        } catch (Exception ex) {
            System.out.println("Not found!");
        }
    }
}
