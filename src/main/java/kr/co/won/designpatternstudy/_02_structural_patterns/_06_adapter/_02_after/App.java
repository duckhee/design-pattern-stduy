package kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._02_after;

import kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._02_after.security.LoginHandler;
import kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler handler = new LoginHandler(userDetailsService);
        String login = handler.login("keesun", "keesun");
        System.out.println("login = " + login);

    }
}
