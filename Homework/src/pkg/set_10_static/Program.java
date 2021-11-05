package pkg.set_10_static;

public class Program {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());

        Account acc = new Account(1122, 20000);
        acc.setYearInterestRate(4.5);

        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.println(acc.toString());
    }
}
