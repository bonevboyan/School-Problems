package pkg.set_5_statements;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem_5_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(""))
            .map(Integer::parseInt).collect(Collectors.toList());

        int lastNum = IntStream.range(0, nums.size())
            .mapToObj(index -> nums.get(index) * (index + 1))
            .collect(Collectors.toList()).stream().mapToInt(Integer::intValue).sum() % 11;

        System.out.printf("The ISBN-10 number is %s%s",
                nums.stream().map(Object::toString).collect(Collectors.joining("")),
            lastNum == 10 ? 'X': String.valueOf(lastNum));
    }
}
