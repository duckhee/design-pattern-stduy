package kr.co.won.designpatternstudy._06_adapter._02_after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
