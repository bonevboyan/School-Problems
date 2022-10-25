package term_3.set_01_entry_exam.exam_3;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(1, "Antonia", 1000);
        account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account.getName());
        System.out.println(account.getMonthlyInterestRate());
        System.out.println(account.getBalance());

        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.println(account.getTransactions().get(i));
        }
    }
}