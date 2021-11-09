package pkg.set_13_string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(isAnagram(sc.nextLine(), sc.nextLine()));
    }
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }

        List<Character> str1 = convertStringToCharList(s1);
        for (char c : str1) {
            s2 = s2.replaceFirst(String.valueOf(c), "");
        }
        return s2.length() == 0;
    }

    public static List<Character> convertStringToCharList(String str)
    {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

}
