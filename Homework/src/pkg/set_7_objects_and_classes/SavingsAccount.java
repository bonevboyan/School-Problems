package pkg.set_7_objects_and_classes;

public class SavingsAccount {
    public String name;
    public double balance;

    public SavingsAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double x) {
        balance += x;
    }

    public void withdraw(double x) {
        if(x <= 0) {
            System.out.println("Cannot withdraw negative amount.");
        } else {
            if (balance < x) {
                System.out.println("Balance is too low to withdraw this much.");
            } else {
                balance -= x;
                System.out.printf("The new balance is: %f", balance);
            }
        }
    }

}
