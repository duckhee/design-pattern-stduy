package kr.co.won.designpatternstudy.singleton;

public class App {
    public static void main(String[] args) {
        Settings instance = Settings.getInstance();
        Settings instance2 = Settings.getInstance();
        System.out.println(instance2 == instance);
    }
}
