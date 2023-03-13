package kr.co.won.designpatternstudy._03_behavioral_patterns._19_observer._03_java;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class SampleEvent extends ApplicationEvent {
    private String msg;

    public SampleEvent(Object source, String msg) {
        // event를 제공하는 publisher 정보
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
