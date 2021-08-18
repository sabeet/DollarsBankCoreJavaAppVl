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
                        //System.out.println(AccountRepo.customerRepo.stream().findFirst()); //remove when done
                        System.out.println("Thank you for your patronage. See you again. \nThis program shall now terminate...");
                        System.exit(0); //close program
                    default:
                        System.out.println("\nInvalid Entry. Please Try Again\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("You entered a letter or a string of letters.\nThis program shall now restart.");
                menu.run();
                 //this is not functioning as required
                choice = 5;
                break;
            }

        } while(choice > 3 || choice < 1 );


    }
}
