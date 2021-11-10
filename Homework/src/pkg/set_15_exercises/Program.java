package pkg.set_15_exercises;

import pkg.set_10_static.Account;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ATM atm = new ATM();
        for (int i = 0; i < 9; i++) {
            atm.addAccount(i, 100);
        }

        String mainMenu = "Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit";

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter an id:");
            int id = sc.nextInt();

            boolean isExit = false;
            while(!isExit){
                System.out.println(mainMenu);
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(atm.getBalance(id));
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double amount = sc.nextDouble();
                        if(!atm.withrawFromId(id, amount)){
                            System.out.println("Invalid id");
                        }
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double amountToDeposit = sc.nextDouble();
                        if(!atm.depositToId(id, amountToDeposit)){
                            System.out.println("Invalid id");
                        }
                        break;
                    case 4:
                        isExit = true;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            }

        }
    }
}
