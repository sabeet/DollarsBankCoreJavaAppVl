package com.dollarsbank.controller;

import com.dollarsbank.utility.optionListings;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking {
    public static void menu(String fname) {

        optionListings.bankingMenuHeader(fname);

        Scanner input = new Scanner(System.in);
        int choice = 0;

        do{
            try{
                switch(choice) {
                    case 1: //deposit

                        choice = 0;
                        break;
                    case 2: //withdrawal

                        choice = 0;
                        break;
                    case 3: //funds

                        choice = 0;
                        break;
                    case 4: //view 5 recent transactions

                        choice = 0;
                        break;
                    case 5: //

                        choice = 0;
                        break;
                    case 6:

                        choice = 0;
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
