package kr.co.won.designpatternstudy._23_visitor._02_after;

public class Phone implements Device {
    @Override
    public void print(Circle circle) {
        System.out.println("Print Circle to Phone");
    }

    @Override
    public void print(Triangle triangle) {
        System.out.println("Print Triangle to Phone");
    }

    @Override
    public void print(Rectangle rectangle) {
        System.out.println("Print Rectangle to Phone");
    }
}
