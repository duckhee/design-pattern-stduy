package kr.co.won.designpatternstudy._01_creational_patterns._02_factorymethod._02_after;

public class BlackShipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
