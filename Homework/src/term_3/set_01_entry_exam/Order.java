package term_3.set_01_entry_exam;

public interface Order {
    String getRecipient();
    Currency getCurrency();
    void addItem(Product item);
    String getOrderItemsInfo();
}
