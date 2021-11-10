package pkg.set_16_data_type_classes;

import java.math.BigInteger;

public class Problem_1 {
    public static void main(String[] args) {
        boolean isEnd = false;
        int count = 0;
        for (BigInteger i = BigInteger.valueOf(10).pow(50); !isEnd; i = i.add(BigInteger.valueOf((1)))) {
            if(i.remainder(BigInteger.valueOf(2)) == BigInteger.valueOf(0) || i.remainder(BigInteger.valueOf(3)) == BigInteger.valueOf(0)){
                count++;
                System.out.println(i);
            }
            if(count == 50){
                isEnd = true;
            }
        }
    }
}
