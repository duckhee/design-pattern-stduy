package kr.co.won.designpatternstudy._06_adapter._02_after;



public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(kr.co.won.designpatternstudy._06_adapter._01_before.Account account) {

    }

    public void updateAccount(Account account) {

    }
}
