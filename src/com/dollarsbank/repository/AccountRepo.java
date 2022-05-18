package com.dollarsbank.repository;

import com.dollarsbank.model.Account;

import java.util.*;

public class AccountRepo {
    public static ArrayList<Account> customerRepo = new ArrayList<>();

    public static void dummyData() {
        Account dummyAcc = new Account("Testing", "Testing", "1231234123", "1010", "9125 184th st", 12000, 0);
        dummyAcc.addTransactionHistory("");
        customerRepo.add(dummyAcc);
    }
}


