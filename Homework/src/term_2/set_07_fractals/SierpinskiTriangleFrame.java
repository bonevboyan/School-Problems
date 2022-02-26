package term_2.set_07_fractals;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {
    private int order = 0;

    private final JButton minusButton = new JButton("-");
    private final JButton plusButton = new JButton("+");
    private final SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel();

    public SierpinskiTriangleFrame() {
        JPanel panel = new JPanel();

        panel.add(minusButton);
        panel.add(plusButton);
        minusButton.setHorizontalAlignment(SwingConstants.RIGHT);
        plusButton.setHorizontalAlignment(SwingConstants.RIGHT);

        add(trianglePanel);
        add(panel, BorderLayout.SOUTH);


        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order++;
                trianglePanel.setOrder(order);
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(order == 0){
                    JOptionPane.showMessageDialog(null, "Triangle order can't be less than 0.");
                    return;
                }
                order--;
                trianglePanel.setOrder(order);
            }
        });
    }
}
