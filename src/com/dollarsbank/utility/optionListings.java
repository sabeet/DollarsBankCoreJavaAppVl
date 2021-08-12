package com.dollarsbank.utility;

public class optionListings {
    public static void initMenu() {
        System.out.println("+---------------------------+");
        System.out.println("|THE DOLLARSBANK WELCOMES YOU|");
        System.out.println("+---------------------------+");

        System.out.println("\n1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit.");

        System.out.println("\nEnter a choice(1,2, or 3): ");
    }

    public static void initRegAccMenuHeader() {
        System.out.println("\n+-----------------------------+");
        System.out.println("|Enter Details For New Account|");
        System.out.println("+-----------------------------+\n");
    }

    public static void loginMenuHeader() {
        System.out.println("\n+----------------+");
        System.out.println("|Enter Login Menu|");
        System.out.println("+----------------+\n");
    }

    public static void bankingMenuHeader(String custName) {
        System.out.println("\n+-----------------------------+");
        System.out.println("|WELCOME TO DOLLARSBANK, "+ custName +" |");
        System.out.println("+------------------------------+\n");
    }

    public static void depositHeader(){

    }
}
