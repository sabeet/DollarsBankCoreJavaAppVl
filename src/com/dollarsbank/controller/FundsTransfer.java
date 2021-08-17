package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class FundsTransfer {
    public static void run(long ac_id) {

        Optional<Account> curr_account = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).findFirst();

        System.out.println("Checkings Account balance : " + curr_account.orElseThrow().getCheckings());
        System.out.println("Savings Account balance : " + curr_account.orElseThrow().getSavings());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you'd like to transfer from Checkings to Savings: \n");
        double amount = input.nextDouble();

        //reduce checkings
        double new_checkings_amount = curr_account.orElseThrow().getCheckings() - amount;
        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.setCheckings(new_checkings_amount));

        //add savings
        double new_savings_amount = curr_account.orElseThrow().getSavings() + amount;
        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.setSavings(new_savings_amount));

        Date now = new Date();
        String transaction_hist_update =
                "\n----------------------"
                        +"\nTransaction recorded on : " + now
                        +"\nTransfered " + amount + " from Checkings Account to Savings Account."
                        +"\n----------------------\n";

        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.addTransactionHistory(transaction_hist_update));

        Optional<Account> adj_curr_account = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).findFirst();

        System.out.println("Checkings Account balance : " + adj_curr_account.orElseThrow().getCheckings());
        System.out.println("Savings Account balance : " + adj_curr_account.orElseThrow().getSavings());

    }
}
