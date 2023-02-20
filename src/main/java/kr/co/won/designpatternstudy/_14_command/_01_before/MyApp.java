package kr.co.won.designpatternstudy._14_command._01_before;

public class MyApp {

    private Game game;

    public MyApp(Game game) {
        this.game = game;
    }

    public void press() {
        this.game.start();
    }

    public static void main(String[] args) {
        MyApp app = new MyApp(new Game());
        app.press();
    }
}
