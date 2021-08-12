package com.dollarsbank.application;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;
import com.dollarsbank.utility.menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        AccountRepo.dummyData();
        menu.run();
    }
}
