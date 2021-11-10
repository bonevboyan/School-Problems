package pkg.set_15_exercises;

import pkg.set_10_static.Account;

import java.util.ArrayList;

public class ATM {
    private ArrayList<Account> accounts;

    public ATM() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(int id, double balance){
        accounts.add(new Account(id, balance));
    }

    public String getBalance(int id) {
        Account acc = accounts.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(acc != null){
            return String.format("The balance is %.2f", acc.getBalance());
        }
        return "Invalid id";
    }

    public boolean withrawFromId(int id, double amount) {
        Account acc = accounts.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(acc != null){
            acc.withdraw(amount);
            return true;
        }
        return false;
    }

    public boolean depositToId(int id, double amount) {
        Account acc = accounts.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(acc != null){
            acc.deposit(amount);
            return true;
        }
        return false;
    }
}
