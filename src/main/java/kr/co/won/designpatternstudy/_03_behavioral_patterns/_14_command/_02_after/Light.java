package kr.co.won.designpatternstudy._03_behavioral_patterns._14_command._02_after;

public class Light {

    private boolean isOn;

    public void on() {
        System.out.println("불을 켭니다.");
        this.isOn = true;
    }

    public void off() {
        System.out.println("불을 끕니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return this.isOn;
    }

}
