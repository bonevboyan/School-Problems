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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    //public void setBalance(double balance) {
    //    this.balance = balance;
    //}

    public double getYearInterestRate() {
        return yearInterestRate;
    }

    public void setYearInterestRate(double yearInterestRate) {
        this.yearInterestRate = yearInterestRate;
    }

    public double getMonthlyInterestRate() {
        return yearInterestRate / 100 / 12;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return String.format("Balance: %.2f, Monthly Interest: %.2f, Date Created: %s", balance, getMonthlyInterest(), dateCreated);
    }
}
