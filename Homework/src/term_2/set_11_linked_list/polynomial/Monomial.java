package term_2.set_11_linked_list.polynomial;

public class Monomial implements Comparable<Monomial> {
    private double coefficient;
    private int power;

    public Monomial(double coefficient, int power) {
        this.coefficient = coefficient;
        this.power = power;

    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) return;

        this.power = power;
    }

    public void addCoefficient(Monomial monomial){
        this.coefficient += monomial.getCoefficient();
    }

    public void multiply(Monomial monomial){
        this.addPower(monomial);
        this.multiplyCoefficient(monomial);
    }

    private void multiplyCoefficient(Monomial monomial){
        this.coefficient *= monomial.getCoefficient();
    }

    private void addPower(Monomial monomial){
        this.power += monomial.power;
    }

    @Override
    public String toString() {
        if(coefficient == 0) return "0";

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%.2f",coefficient));

        if(power == 0){
            return sb.toString();
        }

        sb.append("*x");

        if(power == 1 ) {;
            return sb.toString();
        }

        sb.append(String.format("^%d", power));
        return sb.toString();
    }

    @Override
    public int compareTo(Monomial o) {
        return this.power - o.getPower();
    }

    public static Monomial multiplyMonomials(Monomial monomial, Monomial multiplier){
        return new Monomial(monomial.getCoefficient() * multiplier.getCoefficient(), monomial.getPower() + multiplier.getPower());
    }
}
