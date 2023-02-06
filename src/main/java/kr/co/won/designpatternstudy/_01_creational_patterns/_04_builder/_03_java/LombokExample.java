package kr.co.won.designpatternstudy._01_creational_patterns._04_builder._03_java;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class LombokExample {

    private String title;

    private int nights;

    private int day;
    public static void main(String[] args){
        LombokExample trip = LombokExample.builder()
                .title("여행")
                .day(3)
                .nights(2)
                .build();
        System.out.println("trip = " + trip);
    }
}
