package ModelLogic;

import Repository.Accounts;

import java.util.Scanner;

public class AccountLogic {
    public static void menu() {

        Scanner menuOptions = new Scanner(System.in);

        System.out.println("1. Create New Account");
        System.out.println("2. Login");
        System.out.println("3. Exit.");

        int menuOp = menuOptions.nextInt();

        while(menuOp < 4 || menuOp > 0){
            switch (menuOp){
                case 1:
                    //create an account
                    Scanner loginMenuOpt = new Scanner(System.in);
                    Scanner loginPassMenuOpt = new Scanner(System.in);
                    System.out.println("Please enter your email: ");
                    String usernameEmail = loginMenuOpt.next();
                    System.out.println("Please enter your password: ");
                    String usernamePassword = loginPassMenuOpt.next();

                    if(!Accounts.accountDetails.containsKey(usernameEmail) && !Accounts.accountDetails.containsValue(usernamePassword)) {
                        Accounts.accountDetails.put(usernameEmail, usernamePassword);
                        System.out.println("Your account has been created");

                        //take user to login menu
                        break;
                    }
                    else{
                        System.out.println("Failed Account creation. That username or password has been taken.");
                    }
                    break;

                case 2:
                    //login
                    break;

                case 3:
                    System.out.println("Thank you for banking with us");
                    System.exit(0);
            }
        }
    }
}
