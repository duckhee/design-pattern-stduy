package kr.co.won.designpatternstudy._03_behavioral_patterns._19_observer._03_java;

import java.util.concurrent.Flow;

public class FlowInJava {

    public static void main(String[] args) {

        Flow.Publisher<String> publisher = new Flow.Publisher<String>() {
            @Override
            public void subscribe(Flow.Subscriber<? super String> subscriber) {
                subscriber.onNext("hello Flow");
                subscriber.onComplete();
            }
        };

        Flow.Subscriber subscriber = new Flow.Subscriber<String>() {
            @Override
            public void onSubscribe(Flow.Subscription subscription) {

            }

            @Override
            public void onNext(String item) {
                System.out.println("item = " + item);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("FlowInJava.onComplete");
            }
        };
        publisher.subscribe(subscriber);
        System.out.println("이게 출력이 되기 전에 이미 처리가 다끝남.");
    }

}
