package term_1.set_13_string;

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        System.out.println(isValid(input));
    }
    public static boolean isValid(String ssn){
        for (int i = 0; i < ssn.length(); i++) {
            char c = ssn.charAt(i);

            if(i == 3 || i == 6){
                if(c != '-') {
                    return false;
                }
            }else if(!Character.isDigit(ssn.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
