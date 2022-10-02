package term_3.set_00_revision.pay_system;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException();
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + baseSalary;
    }

    @Override
    public String toString() {
        return "Base Plus" +
                super.toString() +
                "baseSalary=" + baseSalary;
    }
}
