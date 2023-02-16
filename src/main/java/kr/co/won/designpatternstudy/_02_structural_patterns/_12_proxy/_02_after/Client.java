package kr.co.won.designpatternstudy._02_structural_patterns._12_proxy._02_after;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
