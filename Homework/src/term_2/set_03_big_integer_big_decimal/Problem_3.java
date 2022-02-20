package term_2.set_03_big_integer_big_decimal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Problem_3 {
    public static void main(String[] args) {
        System.out.println(calculate(100).toString());
    }

    public static BigDecimal calculate(int n){
        BigDecimal result = BigDecimal.ZERO;
        for (int i = 1; i <= n; i++) {
            result = result.add(getElementN(i));
        }

        return result;
    }

    public static BigDecimal getElementN(int n){
        return BigDecimal.valueOf(1).divide(new BigDecimal(factorial(n)),20, RoundingMode.HALF_EVEN);
    }

    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i < n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }

        return result;
    }
}
