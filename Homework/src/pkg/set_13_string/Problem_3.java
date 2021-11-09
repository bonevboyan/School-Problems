package pkg.set_13_string;

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        System.out.println(isValid(new Scanner(System.in).nextLine()));
    }
    public static boolean isValid(String pass){
        boolean hasDigit = false;
        int digitCount = 0;
        boolean hasLetter = false;

        for (int i = 0; i < pass.length(); i++) {
            if(Character.isDigit(pass.charAt(i))){
                digitCount++;
                hasDigit = true;
            }else if(Character.isAlphabetic(pass.charAt(i))){
                hasLetter = true;
            }
        }

        if(!hasDigit || !hasLetter || pass.length() < 8 || digitCount < 2){
            return  false;
        }

        return true;
    }
}
