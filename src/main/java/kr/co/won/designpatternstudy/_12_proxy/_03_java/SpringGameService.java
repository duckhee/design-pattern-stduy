package kr.co.won.designpatternstudy._12_proxy._03_java;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpringGameService {
    public void startGame() {
        System.out.println("[spring] 이 자리에 오신 여러분을 진심으로 환영합니다.");
    }
}
