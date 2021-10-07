package pkg.set_5_statements;

import java.util.Scanner;

public class Problem_5_1 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Length?");
        double length = scanner.nextDouble();
        System.out.println("Width?");
        double width = scanner.nextDouble();
        System.out.println("Height?");
        double height = scanner.nextDouble();

        double area = length * width + height * length * 2 + height * width * 2;

        int bigBuckets = (int) area / 140;
        double paintLeft = area % 140;
        int smallBuckets = (paintLeft % 30 == 0 ? (int) paintLeft / 30 : (int)  paintLeft / 30 + 1);

        bigBuckets += (smallBuckets >= 4) ? 1 : 0;
        smallBuckets = (smallBuckets >= 4) ? 0 : smallBuckets;

        System.out.printf("You need %d big buckets", bigBuckets);
        if(smallBuckets > 0){
            System.out.printf(" and %d small buckets", smallBuckets);
        }
    }
}
