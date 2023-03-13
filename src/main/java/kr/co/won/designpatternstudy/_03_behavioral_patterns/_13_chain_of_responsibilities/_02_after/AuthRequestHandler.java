package kr.co.won.designpatternstudy._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

public class AuthRequestHandler extends RequestHandler{
    public AuthRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        // 다음과 같이 여기서 다음 기능을 호출을 할것인지 로직이 들어갈 수 있다.
        if(request.getBody().contains("뽑기")){
            super.handle(request);
        }
    }
}
