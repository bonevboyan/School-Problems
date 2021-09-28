package pkg.statements;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem_5_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");

        List<Byte> nums = Arrays.asList(scanner.nextLine().split("(?!^)")).stream().map(x->Byte.parseByte(x)).collect(Collectors.toList());

        byte lastNum = nums.stream().map((x, i)-> x*i).collect(Collectors.toList())

        System.out.println(nums);

    }
}
