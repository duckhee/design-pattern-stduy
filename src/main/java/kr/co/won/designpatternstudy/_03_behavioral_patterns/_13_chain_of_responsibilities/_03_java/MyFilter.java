package kr.co.won.designpatternstudy._03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(urlPatterns = "/hello")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("게임에 참하신 여러분 모두 진심으로 환영합니다." + servletRequest.getRemoteHost()+ " , " + servletRequest.getRemoteAddr());
        // http servlet request
//        (null != servletRequest.getHeader("X-FORWARDED-FOR")) ? servletRequest.getHeader("X-FORWARDED-FOR") : servletRequest.getRemoteAddr();
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("꽝!");
    }
}
