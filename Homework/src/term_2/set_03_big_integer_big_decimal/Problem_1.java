package term_2.set_03_big_integer_big_decimal;

import java.math.BigInteger;

public class Problem_1 {
    public static void main(String[] args) {
        int count = 0;
        for (BigInteger i = BigInteger.valueOf(Long.MAX_VALUE); count < 10; i = i.add(BigInteger.valueOf((1)))) {
            if(i.isProbablePrime(10)){
                System.out.println(i);
                count++;
            }
        }
    }
}
