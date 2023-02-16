package kr.co.won.designpatternstudy._13_chain_of_responsibilities._02_after;

public class LogginRequestHandler extends RequestHandler{

    public LogginRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("logging");
        super.handle(request);
    }
}
