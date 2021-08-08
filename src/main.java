import Repository.Accounts;
import menu.welcome;

public class main {
    public static void main(String[] args) {
        Accounts.addAccounts();
        welcome.DollarWelcome();
        System.out.println("Let the games begin...");
    }
}
