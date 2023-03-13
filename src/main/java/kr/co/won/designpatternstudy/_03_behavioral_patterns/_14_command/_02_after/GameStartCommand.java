package kr.co.won.designpatternstudy._03_behavioral_patterns._14_command._02_after;

public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.start();
    }

    @Override
    public void undo() {
        new GameEndCommand(this.game).execute();
    }
}
