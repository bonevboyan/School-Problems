package term_3.set_01_entry_exam.exam_1;

public class Test {
    public static void main(String[] args) {
        BaseOrder baseOrder = new BaseOrder("test recipient", Currency.bgn);

        baseOrder.addItem(new Product("test product", 19.99, Currency.bgn));
        baseOrder.addItem(new Product("another test product", 6.71, Currency.eur));

        System.out.println(baseOrder.getOrderItemsInfo());
        System.out.println(baseOrder.calculateTotalPrice());
    }
}
