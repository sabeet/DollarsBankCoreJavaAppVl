package ModelLogic;

import Repository.Accounts;

public class LoginLogic {
    public static void login(String usernameEmail, String password) {

        if(Accounts.accountDetails.containsKey(usernameEmail) && Accounts.accountDetails.containsKey(password)){

        }

        else{
            System.out.println("Login failed. Program will be terminated");
            System.exit(0);
        }
    }
}
