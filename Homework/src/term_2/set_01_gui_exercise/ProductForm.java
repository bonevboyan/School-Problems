package term_2.set_01_gui_exercise;

import javax.swing.*;

public class ProductForm {
    private JPanel mainPanel;
    private JLabel descriptionLabel;
    private JLabel priceLabel;

    private JTextField descriptionField;
    private JTextField priceField;

    private JButton addToListButton;

    private JButton sortProductsButton;
    private JButton showProductsButton;
    private JButton averagePriceButton;
    private JLabel products;

    private final ListOfProducts listOfProducts;

    public ProductForm() {
        listOfProducts = new ListOfProducts();

        addToListButton.addActionListener(e -> {
            try{
                listOfProducts.addProduct(new Product(listOfProducts.count() + 1, descriptionField.getText(), Double.parseDouble(priceField.getText())));
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Invalid input!");
            } finally {
                descriptionField.setText("");
                priceField.setText("");
            }
        });

        showProductsButton.addActionListener(e -> products.setText(listOfProducts.toString()));

        averagePriceButton.addActionListener(e -> products.setText(String.format("Average price: %.2f", listOfProducts.averagePrice())));

        sortProductsButton.addActionListener(e -> listOfProducts.sortByPrice());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Product Management");
        frame.setContentPane(new ProductForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
