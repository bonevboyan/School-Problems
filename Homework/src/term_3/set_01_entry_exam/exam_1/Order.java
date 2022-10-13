package term_3.set_01_entry_exam.exam_1;

public interface Order {
    String getRecipient();
    Currency getCurrency();
    void addItem(Product item);
    String getOrderItemsInfo();
}
