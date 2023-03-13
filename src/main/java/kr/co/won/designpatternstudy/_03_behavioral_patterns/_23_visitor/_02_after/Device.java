package kr.co.won.designpatternstudy._03_behavioral_patterns._23_visitor._02_after;

public interface Device {

    void print(Circle circle);

    void print(Triangle triangle);

    void print(Rectangle rectangle);
}
