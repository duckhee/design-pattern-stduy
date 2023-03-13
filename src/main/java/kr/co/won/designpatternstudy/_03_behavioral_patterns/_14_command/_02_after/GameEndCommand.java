package kr.co.won.designpatternstudy._03_behavioral_patterns._14_command._02_after;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        this.game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }
}
