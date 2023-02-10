package kr.co.won.designpatternstudy._11_flyweight._02_after;

public class Character {

    char value;

    String color;

    Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
