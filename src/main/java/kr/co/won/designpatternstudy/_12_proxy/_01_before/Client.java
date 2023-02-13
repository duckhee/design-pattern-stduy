package kr.co.won.designpatternstudy._12_proxy._01_before;

public class Client {

    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
