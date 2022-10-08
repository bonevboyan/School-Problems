package term_3.set_01_entry_exam;

import java.util.ArrayList;

public class BaseOrder implements Order{
    String recipient;
    Currency currency;
    ArrayList<Product> products;

    public BaseOrder(String recipient, Currency currency) {
        this.recipient = recipient;
        this.currency = currency;
        products = new ArrayList<>();
    }

    public BaseOrder(String recipient, Currency currency, ArrayList<Product> products) {
        this.recipient = recipient;
        this.currency = currency;
        this.products = products;
    }

    public void setRecipient(String recipient) {
        if(recipient.length() <= 2) throw new IllegalArgumentException();
        this.recipient = recipient;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String getRecipient() {
        return recipient;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public void addItem(Product item) {
        products.add(item);
    }

    @Override
    public String getOrderItemsInfo() {
        return products.toString();
    }

    public double calculateTotalPrice() {
        return products.stream().mapToDouble(o->o.price).sum();
    }
}
