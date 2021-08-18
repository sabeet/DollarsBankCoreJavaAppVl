package com.dollarsbank.controller;

import com.dollarsbank.utility.menu;
import com.dollarsbank.utility.optionListings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {
    public static void menu(String fname, long id) {

        Scanner input = new Scanner(System.in);
        int choice = 0;

        do{
            try{

                optionListings.bankingMenuHeader(fname);
                //what are my options
                System.out.println("\n" +
                        "1. Deposit\n" +
                        "2. Withdrawal\n" +
                        "3. Funds Transfer\n" +
                        "4. View 5 Recent Transaction\n" +
                        "5. Display Your Information\n" +
                        "6. Sign Out\n" +
                        "\n");

                System.out.println("\n \u001b[32m Enter a choice(1 - 6): \u001b[0m \n");

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
                        System.out.println("\u001b[31m Signing out \u001b[0m \n");
                        menu.run();
                        break;
                    default:
                        System.out.println("\n \u001b[31m Invalid Entry. Please Try Again \u001b[0m \n");
                }
            } catch (InputMismatchException e){
                System.out.println("\u001b[31m You entered a letter or a string of letters.\n Please enter a proper input \u001b[0m");
                Banking.menu(fname, id);
                break;
            }

        }while (choice > 6 || choice < 1);

    }
}
