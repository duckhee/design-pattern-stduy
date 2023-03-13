package kr.co.won.designpatternstudy._03_behavioral_patterns._23_visitor._02_after;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Phone device = new Phone();
        Pad pad = new Pad();
        // 어느 accpet를 사용을 해야하는지 dispatch가 일어난다.
        rectangle.accept(device);
        rectangle.accept(pad);
    }
}
