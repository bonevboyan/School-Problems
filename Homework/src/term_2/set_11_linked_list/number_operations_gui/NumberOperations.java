package term_2.set_11_linked_list.number_operations_gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class NumberOperations {
    private JPanel panel;
    private JButton reverseButton;
    private JButton sortButton;
    private JButton shuffleButton;
    private JTextField numberField;
    private JButton addButton;
    private JTextArea textArea1;

    private final LinkedList<Integer> numbers;

    public NumberOperations() {
        textArea1.setEditable(false);

        numbers = new LinkedList<>();

        addButton.addActionListener(e -> {
            try {
                int number = Integer.parseInt(numberField.getText());
                numbers.add(number);
                updateTextPane();
            } catch (Exception ex) {
                ErrorWindow("Invalid input!" + ex.getLocalizedMessage());
            } finally {
                numberField.setText("");
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(numbers);
                updateTextPane();
            }
        });

        shuffleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.shuffle(numbers);
                updateTextPane();
            }
        });

        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.reverse(numbers);
                updateTextPane();
            }
        });
    }

    private void updateTextPane(){
        textArea1.setText(String.join("\n", Arrays.stream(numbers.toArray(new Integer[0])).map(Object::toString).toList()));
    }

    private void ErrorWindow(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Management");
        frame.setContentPane(new NumberOperations().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
