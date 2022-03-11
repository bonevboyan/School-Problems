package term_2.set_10_exam;

import term_2.set_01_gui_exercise.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DevelopersForm {
    private JComboBox<String> developerTypeDropdown;
    private JTextField nameField;
    private JTextField emailField;
    private JPanel panel;

    private JTextField monthsField;
    private JTextField certificatesField;
    private JTextField yearsField;
    private JTextField companiesField;

    private JLabel typeLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel monthsLabel;
    private JLabel certificateLabel;
    private JLabel yearsLabel;
    private JLabel companyLabel;
    private JButton submitButton;
    private JLabel developersLabel;
    private JLabel averageScore;

    private ArrayList<Developer> developers;

    public DevelopersForm() {
        developers = new ArrayList<>();

        developerTypeDropdown.setSelectedIndex(0);

        monthsField.setVisible(true);
        certificatesField.setVisible(true);
        monthsLabel.setVisible(true);
        certificateLabel.setVisible(true);

        yearsField.setVisible(false);
        companiesField.setVisible(false);
        yearsLabel.setVisible(false);
        companyLabel.setVisible(false);

        developerTypeDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (developerTypeDropdown.getSelectedItem().toString()){
                    case "Intern":
                        monthsField.setVisible(true);
                        certificatesField.setVisible(true);
                        monthsLabel.setVisible(true);
                        certificateLabel.setVisible(true);

                        yearsField.setVisible(false);
                        companiesField.setVisible(false);
                        yearsLabel.setVisible(false);
                        companyLabel.setVisible(false);
                        break;
                    case "Senior":
                        monthsField.setVisible(false);
                        certificatesField.setVisible(false);
                        monthsLabel.setVisible(false);
                        certificateLabel.setVisible(false);

                        yearsField.setVisible(true);
                        companiesField.setVisible(true);
                        yearsLabel.setVisible(true);
                        companyLabel.setVisible(true);
                        break;
                    default:
                        ErrorWindow("Invalid option!");
                        break;
                }
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    switch (developerTypeDropdown.getSelectedItem().toString()){
                        case "Intern":
                            Intern intern = new Intern(nameField.getText(),
                                    emailField.getText(),
                                    Integer.parseInt(monthsField.getText()),
                                    Integer.parseInt(certificatesField.getText()));

                            developers.add(intern);
                            break;
                        case "Senior":
                            Senior senior = new Senior(nameField.getText(),
                                    emailField.getText(),
                                    Integer.parseInt(yearsField.getText()),
                                    Integer.parseInt(companiesField.getText()));

                            developers.add(senior);
                            break;
                        default:
                            ErrorWindow("Invalid option!");
                            break;
                    }
                }catch(Exception ex){
                    ErrorWindow("Invalid input!");
                }finally {
                    nameField.setText("");
                    emailField.setText("");

                    yearsField.setText("");
                    monthsField.setText("");

                    certificatesField.setText("");
                    companiesField.setText("");
                }

                developersLabel.setText("<html>" + String.join("<br>", toArray()) + "</html>");

                averageScore.setText("" + Developer.returnScores(developers));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Management");
        frame.setContentPane(new DevelopersForm().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void ErrorWindow(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public List<String> toArray() {
        return developers.stream()
                .map(Developer::toString)
                .collect(Collectors.toList());
    }
}
