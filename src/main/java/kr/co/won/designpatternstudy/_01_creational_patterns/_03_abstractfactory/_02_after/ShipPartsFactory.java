package kr.co.won.designpatternstudy._01_creational_patterns._03_abstractfactory._02_after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
