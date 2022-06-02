package term_2.set_18_film;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Film> films = loadFilms();
        assert films != null;

        Scanner scanner = new Scanner(System.in);
        String command = "";

        do {
            command = scanner.nextLine();

            switch (command) {
                case "new" -> films.add(getFilmFromInput(scanner, films.size()));
                case "delete" -> {
                    int index = getIndex(scanner);
                    films = films.stream().filter(x -> x.getId() != index).toList();
                }
                case "view" -> printFilms(films);
                default -> {
                }
            }
        } while (!command.equals("exit"));
    }

    public static List<Film> loadFilms() {
        try {
            List<Film> films = new ArrayList<>();

            Scanner scanner = new Scanner(new File("src\\term_2\\set_18_film\\data.txt"));

            while (scanner.hasNextLine()) {
                int type = Integer.parseInt(scanner.nextLine());
                String name = scanner.nextLine();

                String[] tokens = scanner.nextLine().split(" ");
                int year = Integer.parseInt(tokens[0]);
                double budget = Double.parseDouble(tokens[1]);

                if (type == 1) {
                    films.add(new Film(films.size() + 1, name, year, budget));
                } else {
                    String character = tokens[2];
                    films.add(new CartoonFilm(films.size() + 1, name, year, budget, character));
                }
            }

            return films;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static Film getFilmFromInput(Scanner scanner, int filmCount) {
        System.out.print("film type(1 - normal; else - cartoon): ");
        int type = Integer.parseInt(scanner.nextLine());

        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.print("year: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("budget: ");
        double budget = Double.parseDouble(scanner.nextLine());

        if (type == 1) {
            return (new Film(filmCount + 1, name, year, budget));
        } else {
            System.out.print("character: ");
            String character = scanner.nextLine();
            return (new CartoonFilm(filmCount + 1, name, year, budget, character));
        }
    }

    public static int getIndex(Scanner scanner){
        System.out.print("movie id: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void printFilms(List<Film> films){
        for (var film :
                films) {
            System.out.println(film.toString());
        }
    }
}
