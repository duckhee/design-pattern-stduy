package kr.co.won.designpatternstudy._14_command._02_after;

import java.util.Stack;
import java.util.concurrent.ConcurrentMap;

public class Button {

    private Stack<Command> commands = new Stack<>();


    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

    public void undo() {
        if (!commands.empty()) {
            Command pop = commands.pop();
            pop.undo();
        }
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new GameStartCommand(new Game()));
        button.press(new LightOnCommand(new Light()));
        button.undo();
        button.undo();
    }
}
