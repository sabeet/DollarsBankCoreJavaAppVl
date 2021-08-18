package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Deposit {
    public static void run(long ac_id) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you'd like to deposit: \n");
        double depo = input.nextDouble();

        Optional<Account> curr_account_curr_depo_amount = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).findFirst();
        depo = depo + curr_account_curr_depo_amount.orElseThrow().getCheckings();

        double finalDepo = depo;
        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.setCheckings(finalDepo)); // set new value

        Optional<Account> curr_account = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).findFirst(); //grab new value

        Date now = new Date();
        String transaction_hist_update =
                "\n----------------------"
                        +"\nTransaction recorded on : " + now
                +"\nDeposited " + depo + " to Checkings Account."
                +"\n----------------------\n";

        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.addTransactionHistory(transaction_hist_update));

        System.out.println("Account updated. Your checking's balance is now: " + curr_account.orElseThrow().getCheckings()); // display new value

    }
}
