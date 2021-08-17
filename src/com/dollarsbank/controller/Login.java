package com.dollarsbank.controller;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.dollarsbank.model.Account;
import com.dollarsbank.repository.AccountRepo;
import com.dollarsbank.utility.optionListings;

public class Login {
    public static void menu() {

        optionListings.loginMenuHeader();

        Scanner input = new Scanner(System.in);

        boolean login = false;
        while(login != true) {

            //System.out.println("Do you want to login? (Y for yes/ N for no");
            //String yesOrNo = input.next();
            //if(){

            //}
            System.out.println("Enter User id: ");
            long id = input.nextLong();

            System.out.println("Enter User password: ");
            String pass = input.next();

            //use user id to verify password
            //make a boolean value
            //while that boolean value is false, keep looping
            //when true, go to next menu option

            List<Account> Acc = AccountRepo.customerRepo.stream().filter(e -> e.getUser_id() == id).collect(Collectors.toList());
            String retrievedPassword = Acc.get(0).getPassword();
            System.out.println(Acc.toString());
            System.out.println("Retrieved password is: " + retrievedPassword);
            System.out.println("Password entered is: " + pass);
            if(!retrievedPassword.equals(pass)) {
                System.out.println("Invalid Entry. Try Again");
            }
            else{
                System.out.println("You've logged in");
                Banking.menu(Acc.get(0).getFirst_name(), Acc.get(0).getUser_id());
            }
        }
        //enter new menu
    }
}
