package kr.co.won.designpatternstudy._13_chain_of_responsibilities._01_before;

public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        // 사용자가 사용해야하는 handler를 직접 알아야한다는 것이 문제가 발생한다. -> Chain of Responsibility 를 이용하면 해결이 된다.
        RequestHandler requestHandler = new AuthRequestHandler();
        requestHandler.handler(request);
    }
}
