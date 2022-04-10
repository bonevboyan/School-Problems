package term_2.set_13_sets_maps.maps;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class CapitalGuesser {
    private JTextField answerField;

    private JPanel panel;
    private JButton submitButton;
    private JLabel questionLabel;
    private JLabel scoreLabel;

    private int score;
    private HashMap<String, String> countryCapital;

    private String currentCapital;
    private String currentCountry;

    public CapitalGuesser() throws IOException {
        countryCapital = new HashMap<>();
        var list = getCapitals();

        for (CountryCapital cc : list) {
            countryCapital.put(cc.country, cc.capital);
        }

        newQuestion();
        score = 0;
        this.scoreLabel.setText(String.format("Score: %d", score));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if("".equals(answerField.getText())){
                    ShowMessage("Invalid input!");
                }else if(answerField.getText().equals(currentCapital)){
                    ShowMessage("Correct! You get 10 points.");
                    changeScore(10);
                    newQuestion();
                }else{
                    ShowMessage(String.format("The right answer was %s! You lose 10 points.", currentCapital));
                    changeScore(-10);
                    newQuestion();
                }
                answerField.setText("");
            }
        });
    }


    public List<CountryCapital> getCapitals() throws IOException {
        File file = new File("src\\term_2\\set_13_sets_maps\\maps\\capitals.json");
        String text = String.join("\n" , Files.readAllLines(file.toPath().toAbsolutePath(), StandardCharsets.UTF_8).stream().toList());

        var list = Arrays.stream(text.split("},")).map(x -> {
            x = x.replaceAll("[{}\"]", "").replaceAll(",", ":");
            List<String> fields = Arrays.stream(x.split(":")).toList();
            return new CountryCapital(fields.get(1).strip(), fields.get(3).strip());
        }).toList();

        return list;
    }

    public void changeScore(int diff) {
        score += diff;
        this.scoreLabel.setText(String.format("Score: %d", score));
    }

    public void newQuestion() {
        Random generator = new Random();
        var list = countryCapital.entrySet().stream().toList();
        int index = generator.nextInt(list.size());
        currentCapital = list.get(index).getValue();
        currentCountry = list.get(index).getKey();
        this.questionLabel.setText(String.format("What is %s's capital?", currentCountry));
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Capital Guesser");
        frame.setContentPane(new CapitalGuesser().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void ShowMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
