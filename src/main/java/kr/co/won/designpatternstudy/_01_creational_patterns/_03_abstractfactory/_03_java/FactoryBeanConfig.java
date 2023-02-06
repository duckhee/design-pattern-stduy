package kr.co.won.designpatternstudy._01_creational_patterns._03_abstractfactory._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory() {
        return new ShipFactory();
    }
}
