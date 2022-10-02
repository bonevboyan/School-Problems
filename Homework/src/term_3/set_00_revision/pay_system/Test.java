package term_3.set_00_revision.pay_system;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(new Invoice("partNumber", "description", 12, 12));
        payables.add(new SalariedEmployee("Petar", "Zaplatov", "123", 1200));
        payables.add(new BasePlusCommissionEmployee("Petar", "Bazarov", "124", 100, 100, 1000));
        payables.add(new CommissionEmployee("Petar", "Comisarov", "125", 100, 100));
        payables.add(new HourlyEmployee("Peter", "Pochasov", "126", 100, 42));

        for (var payable :
                payables) {
            System.out.println(payable);
            System.out.println(payable.getPaymentAmount());
        }
    }
}
