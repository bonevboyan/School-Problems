package pkg.set_10_static;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double yearInterestRate = 0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date(System.currentTimeMillis());
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
}
