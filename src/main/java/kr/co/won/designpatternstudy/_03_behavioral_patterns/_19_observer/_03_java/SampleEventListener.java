package kr.co.won.designpatternstudy._03_behavioral_patterns._19_observer._03_java;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SampleEventListener implements ApplicationListener<SampleEvent> {
    @Override
    public void onApplicationEvent(SampleEvent event) {
        System.out.println("event = " + event.getMsg());
    }
}
