package term_3.set_00_revision.pay_system;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0) throw new IllegalArgumentException();
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "Salaried Employee:" +
                super.toString() +
                "weeklySalary=" + weeklySalary;
    }
}
