package com.dollarsbank.controller;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;

import java.util.Collections;
import java.util.Optional;

public class LastFiveTransaction {
    public static void run(long ac_id) {

        Optional<Account> curr_account = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == ac_id).findFirst();
        //reverse the al
        Collections.reverse(curr_account.orElseThrow().getTransaction_history());

        int al_size = curr_account.orElseThrow().getTransaction_history().size();


        if(al_size < 6){
            for(int i = 0; i <= al_size - 1; i++){
                System.out.println(curr_account.orElseThrow().getTransaction_history().get(i));
            }
        }
        else if(al_size > 4){
            for(int i = 0; i == 5; i++){
                System.out.println(curr_account.orElseThrow().getTransaction_history().get(i));
            }
        }
        else{
            System.out.println("No transaction history available");
        }

    }
}
