package term_2.set_07_fractals;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
    private int order = 0;
    private final int maxOrder = 10;

    private final JComboBox dropdown = new JComboBox(new String[]{"Text field", "Plus/Minus Buttons"});

    private final JButton minusButton = new JButton("-");
    private final JButton plusButton = new JButton("+");

    private final JLabel orderLabel = new JLabel("Order: " + order);

    private JTextField jtfOrder = new JTextField("", 5);

    private final SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel();

    public SierpinskiTriangleFrame() {
        JPanel panel = new JPanel();

        panel.add(dropdown);
        panel.add(orderLabel);
        add(panel, BorderLayout.SOUTH);
        panel.add(jtfOrder);

        add(trianglePanel);
        add(panel, BorderLayout.SOUTH);

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(order == 10){
                    ErrorWindow("Triangle order must be in the range [0, 10].");
                    return;
                }
                order++;
                trianglePanel.setOrder(order);
                UpdateOrderLabel();
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(order == 0){
                    ErrorWindow("Triangle order must be in the range [0, 10].");
                    return;
                }
                order--;
                trianglePanel.setOrder(order);
                UpdateOrderLabel();
            }
        });

        jtfOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int newOrder = Integer.parseInt(jtfOrder.getText());
                    jtfOrder.setText("");

                    if(newOrder < 0 || newOrder > 10){
                        throw new InputMismatchException();
                    }

                    order = newOrder;
                    trianglePanel.setOrder(newOrder);
                    UpdateOrderLabel();
                }catch (InputMismatchException ex){
                    ErrorWindow("Invalid Input! Order must be in the range [0, 10].");
                }catch (NumberFormatException ex){
                    ErrorWindow("Invalid Input! Order must be an integer.");
                }
            }
        });

        dropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (dropdown.getSelectedIndex()){
                    case 0:
                        panel.remove(minusButton);
                        panel.remove(plusButton);
                        panel.add(jtfOrder);
                        break;
                    case 1:
                        panel.remove(jtfOrder);
                        panel.add(minusButton);
                        panel.add(plusButton);
                        break;
                    default:
                        ErrorWindow("Unexpected error!");
                        break;
                }
                panel.revalidate();
                panel.repaint();
            }
        });

    }

    private void ErrorWindow(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    private void UpdateOrderLabel(){
        orderLabel.setText("Order: " + order);
    }
}
