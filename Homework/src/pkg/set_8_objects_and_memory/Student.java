package pkg.set_8_objects_and_memory;

public class Student {
    private String name;

    private double gpa;

    private double transferredMoney;

    public Student(){

    }

    public Student(String name, double gpa, double transferredMoney) {
        this.name = name;
        this.gpa = gpa;
        this.transferredMoney = transferredMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTransferredMoney() {
        return transferredMoney;
    }

    public void setTransferredMoney(double transferredMoney) {
        this.transferredMoney = transferredMoney;
    }

    public void addTransferredMoney(double moneyToBeTransferred) {
        if(moneyToBeTransferred > 0){
            transferredMoney += moneyToBeTransferred;
        }
    }
}
