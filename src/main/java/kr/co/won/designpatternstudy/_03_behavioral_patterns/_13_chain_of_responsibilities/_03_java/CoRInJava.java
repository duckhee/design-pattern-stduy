package kr.co.won.designpatternstudy._03_behavioral_patterns._13_chain_of_responsibilities._03_java;

import jakarta.servlet.*;

import java.io.IOException;


public class CoRInJava {

    public static void main(String[] args) {
        Filter filter = new Filter() {

            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
                // 전처리
                filterChain.doFilter(servletRequest, servletResponse);
                // 후처리

            }
        };
    }
}
