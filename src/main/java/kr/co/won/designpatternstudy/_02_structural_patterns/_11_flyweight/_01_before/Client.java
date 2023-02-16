package kr.co.won.designpatternstudy._02_structural_patterns._11_flyweight._01_before;

public class Client {
    public static void main(String[] args) {
        // 다음과 같이 자주 변화하지 않는 값이 여러번 사용이 되어서 메모리 할당을 각 객체에 따라서 해주므로써,
        // 메모리를 많이 사용을 하여, 단점이 된다.
        Character c1 = new Character('h', "white", "Nanum", 12);
        Character c2 = new Character('e', "white", "Nanum", 12);
        Character c3 = new Character('l', "white", "Nanum", 12);
        Character c4 = new Character('l', "white", "Nanum", 12);
        Character c5 = new Character('o', "white", "Nanum", 12);
    }
}
