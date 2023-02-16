package kr.co.won.designpatternstudy._02_structural_patterns._08_composite._02_after;

public class Client {
    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(bag);
    }

    // 타입의 variable에 가능한 한 추상 타입을 쓰는게 코드 작성을 하는데 도움이 된다.
    // Item 출력하냐, Bag 출력하냐를 하나의 Method에서 처리가 할 수 있는 것처럼 추상적인 값을 사용하는 것이 좋다.
    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
