package kr.co.won.designpatternstudy._01_creational_patterns._03_abstractfactory._01_before;

public class WhiteShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setWhiteAnchor(new WhiteAnchor());
        ship.setWhiteWheel(new WhiteWheel());

        return ship;
    }
}
