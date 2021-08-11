package com.dollarsbank.utility;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class menu {
    public static void run() {

        Scanner input = new Scanner(System.in);
        int choice = 0;



        do{
            try {
                optionListings.initMenu();
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        System.out.println("Thank you for your patronage. See you again. \nThis program shall now terminate...");
                        System.exit(0);
                    default: //TODO: case where user inputs a letter
                        System.out.println("\nInvalid Entry. Please Try Again\n");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Entry. Program shall now terminate.");
                choice = 0; //this is not functioning as required
                continue;
            }

        } while(choice > 3);
    }
}
