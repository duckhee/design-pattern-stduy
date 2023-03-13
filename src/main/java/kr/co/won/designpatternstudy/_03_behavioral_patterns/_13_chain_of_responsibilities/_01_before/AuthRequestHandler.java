package kr.co.won.designpatternstudy._03_behavioral_patterns._13_chain_of_responsibilities._01_before;

public class AuthRequestHandler extends RequestHandler{
    @Override
    public void handler(Request request) {
        System.out.println("인증이 되었나?");
        System.out.println("이 핸드럴를 사용할 수 있는 유저인가?");
        super.handler(request);
    }
}
