package kr.co.won.designpatternstudy._23_visitor._02_after;

public class Pad implements Device{
    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Pad");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print Triangle to Pad");
    }

    // 어느 device를 사용을 해야하는지 dispatch가 일어난다.
    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print Rectangle to Pad");
    }
}
