package kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._02_after;


import kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

/**
 * 연결을 하는 class를 별도로 만들어서 연결을 하는 방법
 */
public class AccountUserDetailsService implements UserDetailsService {

    // adaptee 의 역활을 하는 객체를 여기서 사용을 하는 방법
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        AccountUserDetails accountUserDetails = new AccountUserDetails(accountByUsername);
        return accountUserDetails;
    }
}
