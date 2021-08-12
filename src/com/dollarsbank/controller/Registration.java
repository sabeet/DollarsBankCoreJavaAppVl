package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;
import com.dollarsbank.utility.optionListings;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Registration {
    public static void menu() {

        optionListings.initRegAccMenuHeader();

        Scanner inp = new Scanner(System.in);

        System.out.println("Customer First Name: ");
        String customer_fname = inp.nextLine();
        System.out.println("Customer Last Name: ");
        String customer_lname = inp.nextLine();
        System.out.println("Customer Address: ");
        String customer_addr = inp.nextLine();;
        System.out.println("Phone Number: ");
        String customer_phone = inp.nextLine();;
        System.out.println("Password: ");
        String customer_password = inp.nextLine();;
        System.out.println("Initial Deposit Amount to Checkings Account: ");
        Double customer_init_depo = inp.nextDouble();

        Date now = new Date();
        String first_transaction = "\n----------------\nTransaction recorded on : " + now + "\nInitial deposit of " + customer_init_depo + " has been made to Checkings Account.\n----------------\n" ;

        Account customer = new Account(customer_fname, customer_lname, customer_phone,  customer_password, customer_addr, customer_init_depo, 0);
        AccountRepo.customerRepo.add(customer);

        System.out.println("Thank you for choosing DOLLARSBANK, " + customer_fname);

        List<Account> number = AccountRepo.customerRepo.stream().filter(e -> e.getPhone_number().equals(customer_phone)).collect(Collectors.toList());

        System.out.println("Your user id no. is : " + number.get(0).getUser_id() );
        System.out.println("DollarsDB updated...");
        System.out.println("You have been added as a fellow patron to our bank.");

        System.out.println("Please log in to use our bank to the fullest.");

    }
}
