package term_2.set_03_big_integer_big_decimal;

import java.math.BigInteger;

public class Problem_2 {
    public static void main(String[] args) {
        System.out.printf("i         m(i)\n%s\n", new String(new char[16]).replace("\0", "_"));
        for (int i = 1; i <= 100; i++) {
            var bigInteger = getElement(i);
            if(bigInteger.isProbablePrime(10)){
                System.out.printf("%-4d%12.4s\n", i, bigInteger.toString());
            }
        }
    }

    public static BigInteger getElement(int p){
        return BigInteger.valueOf((long)2).pow(p).subtract(BigInteger.valueOf(1));
    }
}
