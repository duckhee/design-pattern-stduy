package kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after.champion;

import kr.co.won.designpatternstudy._02_structural_patterns._07_bridge._02_after.champion.skin.Skin;

public abstract class DefaultChampion implements Champion {

    private Skin skin;

    private String name;

    public DefaultChampion(Skin skin, String name) {
        this.skin = skin;
        this.name = name;
    }


    @Override
    public void move() {
        System.out.printf("%s %s move\r\n", skin.getName(), this.name);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q\r\n", skin.getName(), this.name);

    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W\r\n", skin.getName(), this.name);

    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E\r\n", skin.getName(), this.name);

    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R\r\n", skin.getName(), this.name);

    }
}
