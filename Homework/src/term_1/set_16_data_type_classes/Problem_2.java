package term_1.set_16_data_type_classes;

import java.math.BigInteger;

public class Problem_2 {
    public static void main(String[] args) {
        boolean isEnd = false;
        int count = 0;
        for (BigInteger i = BigInteger.valueOf(Long.MAX_VALUE); !isEnd; i = i.add(BigInteger.valueOf((1)))) {
            if(i.remainder(BigInteger.valueOf(5)) == BigInteger.valueOf(0) || i.remainder(BigInteger.valueOf(6)) == BigInteger.valueOf(0)){
                count++;
                System.out.println(i);
            }
            if(count == 10){
                isEnd = true;
            }
        }
    }
}
