package kr.co.won.designpatternstudy._02_factorymethod._03_java;

import kr.co.won.designpatternstudy._02_factorymethod._02_after.BlackShip;
import kr.co.won.designpatternstudy._02_factorymethod._02_after.WhiteShip;

public class SimpleFactory {

    // simple Factory method라고 부른다.
    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }
        throw new IllegalArgumentException();
    }
}
