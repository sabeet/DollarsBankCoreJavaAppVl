package com.dollarsbank.utility;

public class optionListings {
    public static void initMenu() {
        System.out.println("\u001b[34m+---------------------------+");
        System.out.println("|THE DOLLARSBANK WELCOMES YOU|");
        System.out.println("+---------------------------+\u001b[0m");

        System.out.println("\n1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit.");

        System.out.println("\n \u001b[32mEnter a choice(1,2, or 3): \u001b[0m ");
    }

    public static void initRegAccMenuHeader() {
        System.out.println("\n \u001b[34m+-----------------------------+");
        System.out.println("|Enter Details For New Account|");
        System.out.println("+-----------------------------+ \u001b[0m \n");
    }

    public static void loginMenuHeader() {
        System.out.println("\n \u001b[34m+----------------+");
        System.out.println("|Enter Login Menu|");
        System.out.println("+----------------+ \u001b[0m \n");
    }

    public static void bankingMenuHeader(String custName) {
        System.out.println("\n \u001b[34m+-----------------------------+");
        System.out.println("|WELCOME TO DOLLARSBANK, "+ custName +" |");
        System.out.println("+------------------------------+ \u001b[0m \n");
    }

}
