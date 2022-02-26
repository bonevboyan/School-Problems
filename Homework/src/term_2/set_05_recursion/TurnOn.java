package term_2.set_05_recursion;

import java.util.Scanner;

public class TurnOn {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        TurnOnLine(n);
    }

    public static void TurnOnLine(int n) {
        switch (n) {
            case 1 -> System.out.println("+1");
            case 2 -> System.out.println("+1\n+2");
            default -> {
                TurnOnOnly(n - 1);
                System.out.println("+" + n);
                TurnOnLine(n - 2);
            }
        }
    }

    public static void TurnOnOnly(int p) {
        if(p == 1){
            System.out.println("+1");
        }else{
            TurnOnOnly(p - 1);
            System.out.println("+" + p);
            TurnOffLine(p - 1);
        }
    }

    public static void TurnOffLine(int q) {
        if(q == 1){
            System.out.println("-1");
        }else{
            TurnOnOnly(q - 1);
            System.out.println("-" + q);
            TurnOffLine(q - 1);
        }
    }
}
