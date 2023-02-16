package kr.co.won.designpatternstudy._02_structural_patterns._11_flyweight._03_java;

public class FlyweightInJava {

    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        // 숫자나 문자열 비교할 때, == 을 사용을 하면 cache 이 되어서 반환을 하는 경우가 있으므로
        // equals 를 사용해서 비교하는 것이 가장 좋다. == 는 cache 되어 있는 값을 비교하기 때문에
        // 같은 값이라고 나오는 오류를 범할 수 있다.
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}

