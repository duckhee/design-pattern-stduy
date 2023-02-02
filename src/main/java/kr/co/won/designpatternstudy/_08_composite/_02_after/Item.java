package kr.co.won.designpatternstudy._08_composite._02_after;

// Leaf Type 이다.
public class Item implements Component {

    private String name;

    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
