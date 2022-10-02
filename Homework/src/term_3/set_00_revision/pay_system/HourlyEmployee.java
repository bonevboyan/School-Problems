package term_3.set_00_revision.pay_system;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0) throw new IllegalArgumentException();
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0 || hours > 168) throw new IllegalArgumentException();
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        if (hours <= 40)
            return wage * hours;
        return 40 * wage + (hours - 40) * wage * 1.5;
    }

    @Override
    public String toString() {
        return "Hourly Employee" +
                super.toString() +
                "wage=" + wage +
                ", hours=" + hours;
    }
}
