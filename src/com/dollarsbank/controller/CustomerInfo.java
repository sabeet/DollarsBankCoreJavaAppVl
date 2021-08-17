package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;

import java.util.Optional;

public class CustomerInfo {
    public static void run(long ac_id) {

        Optional<Account> curr_account = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).findFirst();

        //curr_account.orElseThrow().get

        System.out.println("First name: " + curr_account.orElseThrow().getFirst_name());
        System.out.println("Last name: " + curr_account.orElseThrow().getLast_name());
        System.out.println("Phone Number: " + curr_account.orElseThrow().getPhone_number());
        System.out.println("Address: " + curr_account.orElseThrow().getAddress());
        System.out.println("Checkings Balance: " + curr_account.orElseThrow().getCheckings());
        System.out.println("Savings Balance: " + curr_account.orElseThrow().getSavings());



    }
}
