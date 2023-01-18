package kr.co.won.designpatternstudy._02_factorymethod._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        Ship whiteShip = new WhiteShipFactory().orderShip("Whiteship", "keesun@email.com");
        System.out.println(whiteShip);

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "keesun@email.com");
        System.out.println(blackShip);
    }
}
