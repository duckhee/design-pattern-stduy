package kr.co.won.designpatternstudy._01_creational_patterns._03_abstractfactory._02_after;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

        ShipFactory factory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship shipNormal = factory.createShip();
        System.out.println(shipNormal.getAnchor().getClass());
        System.out.println(shipNormal.getWheel().getClass());
    }
}
