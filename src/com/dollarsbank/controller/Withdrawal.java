package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Withdrawal {
    public static void run(long ac_id) {

        Optional<Account> curr_account_checkings_amount = AccountRepo.customerRepo
                .stream()
                .filter(e -> e.getUser_id() == ac_id)
                .findFirst();

        System.out.println("Current amount in checkings account is : " + curr_account_checkings_amount.orElseThrow().getCheckings());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you'd like to withdraw: \n");
        double withD = input.nextDouble();
        double new_amount;

        new_amount = curr_account_checkings_amount.orElseThrow().getCheckings() - withD;

        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.setCheckings(new_amount));

        Date now = new Date();
        String transaction_hist_update =
                "\n----------------------"
                        +"\nTransaction recorded on : " + now
                        +"\nWithdrew " + withD + " from Checkings Account."
                        +"\n----------------------\n";

        AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).forEach(e -> e.addTransactionHistory(transaction_hist_update));

        System.out.println("Account updated. You're checking's balance is now: " + curr_account_checkings_amount.orElseThrow().getCheckings());
    }
}
