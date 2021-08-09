import ModelLogic.AccountLogic;
import Repository.Accounts;
import menu.welcome;

public class main {
    public static void main(String[] args) {
        Accounts.addAccounts();
        welcome.DollarWelcome();
        AccountLogic.menu();
    }
}
