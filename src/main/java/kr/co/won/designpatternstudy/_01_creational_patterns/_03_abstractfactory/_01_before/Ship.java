package kr.co.won.designpatternstudy._01_creational_patterns._03_abstractfactory._01_before;

public class Ship {
    private String name;

    private String color;

    private String logo;

    private WhiteWheel whiteWheel;
    private WhiteAnchor whiteAnchor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public WhiteWheel getWhiteWheel() {
        return whiteWheel;
    }

    public void setWhiteWheel(WhiteWheel whiteWheel) {
        this.whiteWheel = whiteWheel;
    }

    public WhiteAnchor getWhiteAnchor() {
        return whiteAnchor;
    }

    public void setWhiteAnchor(WhiteAnchor whiteAnchor) {
        this.whiteAnchor = whiteAnchor;
    }
}
