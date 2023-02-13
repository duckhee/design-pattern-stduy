package kr.co.won.designpatternstudy._12_proxy._02_after;

public class GameServiceProxyExtension extends DefaultGameService {

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        super.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
