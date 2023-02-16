package kr.co.won.designpatternstudy._02_structural_patterns._11_flyweight._02_after;

// flywegiht(intrinsic 한 객체, 변화가 없는 객체)는 공유하는 객체이므로, immutable(변경이 되지 않는 객체) 해야한다.
// => immutable한 객체로 만들기 위해서는 java에서 변경이 더 이상 일어나지 않는다는 keyword인 final 을 사용해 주면 된다.
public class Font {

    final String family;

    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }

    public int getSize() {
        return size;
    }
}
