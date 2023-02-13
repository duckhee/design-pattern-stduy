package kr.co.won.designpatternstudy._12_proxy._02_after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    public GameServiceProxy() {

    }

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();
    }
}
