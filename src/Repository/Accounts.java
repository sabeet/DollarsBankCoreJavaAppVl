package Repository;

import java.util.HashMap;

public class Accounts {
    public static HashMap<String, String> accountDetails =  new HashMap<>();

    public static void addAccounts() {
        accountDetails.put("sabeet@potato.com", "123");
    }
}
