package com.dollarsbank.controller;

import com.dollarsbank.utility.menu;
import com.dollarsbank.utility.optionListings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {
    public static void menu(String fname, long id) {

        optionListings.bankingMenuHeader(fname);

        Scanner input = new Scanner(System.in);
        int choice = 0;

        do{
            try{
                //what are my options
                System.out.println("" +
                        "1. Deposit\n" +
                        "2. Withdrawal\n" +
                        "3. Funds Transfer\n" +
                        "4. View 5 Recent Transaction\n" +
                        "5. Display Your Information\n" +
                        "6. Sign Out\n" +
                        "");

                choice = input.nextInt();

                switch(choice) {
                    case 1: //deposit
                        Deposit.run(id);
                        choice = 0;
                        break;
                    case 2: //withdrawal
                        Withdrawal.run(id);
                        choice = 0;
                        break;
                    case 3: //funds
                        FundsTransfer.run(id);
                        choice = 0;
                        break;
                    case 4: //view 5 recent transactions
                        LastFiveTransaction.run(id);
                        choice = 0;
                        break;
                    case 5: //customer info
                        CustomerInfo.run(id);
                        choice = 0;
                        break;
                    case 6:
                        System.out.println("Signing out\n");
                        menu.run();
                        break;
                    default:
                        System.out.println("\nInvalid Entry. Please Try Again\n");
                }
            } catch (InputMismatchException e){
                System.out.println("You entered a letter or a string of letters.\nThis program shall now terminate.");
                break;
            }

        }while (choice > 6 || choice < 1);

    }
}
