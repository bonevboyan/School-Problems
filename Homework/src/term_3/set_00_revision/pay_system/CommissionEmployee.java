package term_3.set_00_revision.pay_system;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales < 0) throw new IllegalArgumentException();
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(grossSales < 0 || grossSales > 1) throw new IllegalArgumentException();
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return "Commission Employee:" +
                super.toString() +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate;
    }
}
