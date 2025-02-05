package kr.co.won.designpatternstudy._03_behavioral_patterns._14_command._03_java;

import kr.co.won.designpatternstudy._03_behavioral_patterns._14_command._02_after.Game;
import kr.co.won.designpatternstudy._03_behavioral_patterns._14_command._02_after.Light;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandInJava {

    public static void main(String[] args) {
        Light light = new Light();
        Game game = new Game();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(light::on);
        executorService.submit(game::start);
        executorService.submit(game::end);
        executorService.submit(light::off);
        // Thread 종료
        executorService.shutdown();

    }
}
