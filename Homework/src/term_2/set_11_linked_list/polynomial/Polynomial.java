package term_2.set_11_linked_list.polynomial;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Polynomial {
    private LinkedList<Monomial> monomials;

    public Polynomial(Monomial[] monomials) {
        this.monomials = new LinkedList<>(Arrays.asList(monomials));
    }

    public List<Monomial> getMonomials() {
        List<Monomial> monomialList = Arrays.stream(monomials.toArray(new Monomial[0])).filter(x -> x.getCoefficient() != 0).toList();
        List<Monomial> modifiableList = new ArrayList<Monomial>(monomialList);
        Collections.sort(modifiableList);
        Collections.reverse(modifiableList);
        return modifiableList;
    }

    public static Polynomial create(Monomial[] monomials) {
        return new Polynomial(monomials);
    }

    public void addMonomial(Monomial monomial) {
        Monomial monoInPoly = getMonomials().stream().filter(x -> x.getPower() == monomial.getPower()).findFirst().orElse(null);

        if (monoInPoly == null) {
            monomials.add(monomial);
        } else {
            monoInPoly.addCoefficient(monomial);
        }

    }

    public void addPolynomial(Polynomial polynomial) {
        for (Monomial monomial : polynomial.getMonomials()) {
            addMonomial(monomial);
        }
    }

    public void multiplyPolynomialByMonomial(Monomial multiplier) {
        for (Monomial monomial : this.getMonomials()) {
            monomial.multiply(multiplier);
        }
    }

    public void multiplyPolynomials(Polynomial polynomial) {
        Polynomial newPolynomial = new Polynomial(new Monomial[]{});

        for (Monomial monomial : this.getMonomials()) {
            for (Monomial multiplier : polynomial.getMonomials()) {
                newPolynomial.addMonomial(Monomial.multiplyMonomials(monomial, multiplier));
            }
        }

        this.monomials = newPolynomial.monomials;
    }

    @Override
    public String toString() {
        return String.join(" + ", getMonomials().stream().map(Object::toString).toList());
    }
}
