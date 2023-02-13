package kr.co.won.designpatternstudy._12_proxy._03_java;

import kr.co.won.designpatternstudy._12_proxy._02_after.GameService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App.class);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Bean
    public ApplicationRunner applicationRunner(SpringGameService gameService) {
        return args -> gameService.startGame();
    }
}
