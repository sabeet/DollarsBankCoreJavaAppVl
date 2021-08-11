package com.dollarsbank.utility;

import java.util.Date;
import java.util.Scanner;

public class menu {
    public static void run() {

        Scanner input = new Scanner(System.in);
        int choice = 0;



        do{
            optionListings.initMenu();
            choice = input.nextInt();
            if(choice > 3){ //TODO: InputMismatch return
                System.out.println("\nInvalid Entry. Try again\n");
            }
        }
        while(choice > 3);
    }
}
