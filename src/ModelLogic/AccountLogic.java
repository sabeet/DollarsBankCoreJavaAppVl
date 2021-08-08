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
                    Accounts.accountDetails.put(null,null);
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
