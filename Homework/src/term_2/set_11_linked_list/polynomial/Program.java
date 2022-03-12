package term_2.set_11_linked_list.polynomial;

public class Program {
    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial(new Monomial[]{
                new Monomial(0, 100),
                new Monomial(10, 4),
                new Monomial(5, 3),
                new Monomial(4, 2),
                new Monomial(3, 1),
                new Monomial(2, 0)
        });

        Polynomial otherPolynomial = new Polynomial(new Monomial[]{
                new Monomial(0, 100),
                new Monomial(10, 4),
                new Monomial(5, 3),
                new Monomial(4, 2),
                new Monomial(3, 1),
                new Monomial(2, 0)
        });

        System.out.println(polynomial.toString());

        polynomial.multiplyPolynomialByMonomial(new Monomial(2, 1));

        System.out.println(polynomial.toString());

        polynomial.multiplyPolynomials(otherPolynomial);

        System.out.println(polynomial.toString());

        polynomial.addPolynomial(otherPolynomial);

        System.out.println(polynomial.toString());
    }
}
