package kr.co.won.designpatternstudy._03_behavioral_patterns._18_memento._02_after;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        game.setBlueTeamScore(10);
        game.setRedTeamScore(20);

        GameSave save = game.save();

        game.setBlueTeamScore(12);
        game.setRedTeamScore(22);
        game.restore(save);
        System.out.println(game.getRedTeamScore());
        System.out.println(game.getBlueTeamScore());
    }
}
