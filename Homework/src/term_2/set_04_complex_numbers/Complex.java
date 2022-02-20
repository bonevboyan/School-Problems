package term_2.set_04_complex_numbers;

public class Complex implements Comparable<Complex>, Cloneable {
    private double a;
    private double b;

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(double a) {
        this(a, 0);
    }

    public void add(Complex complex) {
        a += complex.a;
        b += complex.b;
    }

    public void subtract(Complex complex) {
        a -= complex.a;
        b -= complex.b;
    }

    public void multiply(Complex complex) {
        a = a * complex.a - b * complex.b;
        b = b * complex.a + a * complex.b;
    }

    public void divide(Complex complex) {
        a = (a * complex.a + b * complex.b) / (complex.a * complex.a + complex.b * complex.b);
        b = (b * complex.a - a * complex.b) / (complex.a * complex.a + complex.b * complex.b);
    }

    public double abs() {
        return Math.sqrt(a * a + b * b);
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    @Override
    public int compareTo(Complex complex) {
        return Double.compare(this.abs(), complex.abs());
    }

    @Override
    public Complex clone() throws CloneNotSupportedException {
        Complex clone = (Complex) super.clone();

        clone.a = a;
        clone.b = b;

        return clone;
    }

    @Override
    public String toString() {
        return b == 0 ? String.format("%f", a) :  String.format("(%f + %fi)", a, b);
    }
}