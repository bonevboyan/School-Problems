package term_2.set_18_film;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Form {
    private JComboBox<String> comboBox;
    private JTextField nameField;
    private JTextField yearField;
    private JTextField priceField;
    private JTextField characterField;
    public JPanel panel;
    private JLabel characterLabel;
    private JButton submitButton;
    private JPanel moviesPanel;

    List<Film> films;

    public Form() {
        films = loadFilms();
        //moviesPanel = new JPanel(new GridBagLayout());

        comboBox.setSelectedIndex(0);

        nameField.setVisible(true);
        yearField.setVisible(true);
        priceField.setVisible(true);
        characterField.setVisible(false);
        characterLabel.setVisible(false);

        paint();

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (comboBox.getSelectedItem().toString()){
                    case "Normal Film":
                        characterField.setVisible(false);
                        characterLabel.setVisible(false);
                        break;
                    case "Animation":
                        characterField.setVisible(true);
                        characterLabel.setVisible(true);
                        break;
                    default:
                        break;
                }
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    switch (comboBox.getSelectedItem().toString()){
                        case "Normal Film":
                            Film film = new Film(films.size() + 1, nameField.getText(),
                                    Integer.parseInt(yearField.getText()), Double.parseDouble(priceField.getText()));

                            films.add(film);
                            break;
                        case "Animation":
                            Film cartoonFilm = new CartoonFilm(films.size() + 1, nameField.getText(),
                                    Integer.parseInt(yearField.getText()), Double.parseDouble(priceField.getText()),
                                    characterField.getText());

                            films.add(cartoonFilm);
                            break;
                        default:
                            break;
                    }
                }catch(Exception ignored){
                }finally {
                    nameField.setText("");
                    yearField.setText("");

                    priceField.setText("");
                    characterField.setText("");
                }

                paint();
            }
        });
    }

    public void paint(){
        moviesPanel.removeAll();

        for (int i = 0; i < films.size(); i++) {

            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridy = i;
            gridBagConstraints.gridx = 0;
            JLabel label = new JLabel(films.get(i).toString());
            moviesPanel.add(label, gridBagConstraints);

            gridBagConstraints.gridy = i;
            gridBagConstraints.gridx = 1;
            JButton delete = new JButton("Delete");

            int finalI = i;
            delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    films.remove(finalI);
                    moviesPanel.remove(finalI);
                    paint();
                }
            });
            moviesPanel.add(delete, gridBagConstraints);

        }
        panel.revalidate();
        panel.repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Management");
        frame.setContentPane(new Form().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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
