package com.dollarsbank.utility;

import com.dollarsbank.controller.Login;
import com.dollarsbank.controller.Registration;
import com.dollarsbank.repository.AccountRepo;

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
                choice = input.nextInt(); //look into hasNextInt

                switch (choice) {
                    case 1:
                        Registration.menu();
                        choice = 0; //this is to reset the loop
                        break;
                    case 2:
                        Login.menu();
                        choice = 0; //this is to reset the loop
                        break;
                    case 3:
                        System.out.println("\n\u001b[31mThank you for your patronage. See you again. \nThis program shall now terminate... \u001b[0m");
                        System.exit(0); //close program
                    default:
                        System.out.println("\n\u001b[31mInvalid Entry. Please Try Again\u001b[0m\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\u001b[31mYou entered a letter or a string of letters.\nThis program shall now restart.\u001b[0m");
                menu.run();
                 //this is not functioning as required
                choice = 5;
                break;
            }

        } while(choice > 3 || choice < 1 );


    }
}
