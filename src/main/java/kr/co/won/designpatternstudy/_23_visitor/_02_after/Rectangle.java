package kr.co.won.designpatternstudy._23_visitor._02_after;

public class Rectangle implements Shape {

    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
