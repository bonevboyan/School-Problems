package term_3.set_01_entry_exam.exam_3;

import java.util.Date;

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String desciption;

    public Transaction(char type, double amount, double balance, String desciption) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.desciption = desciption;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", desciption='" + desciption + '\'' +
                '}';
    }
}

