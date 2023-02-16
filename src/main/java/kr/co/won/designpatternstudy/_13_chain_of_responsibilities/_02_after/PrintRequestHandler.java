package kr.co.won.designpatternstudy._13_chain_of_responsibilities._02_after;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler requestHandler) {
        super(requestHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("request = " + request.getBody());
        super.handle(request);
    }
}
