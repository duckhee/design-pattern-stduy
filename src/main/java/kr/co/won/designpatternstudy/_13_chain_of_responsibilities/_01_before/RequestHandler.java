package kr.co.won.designpatternstudy._13_chain_of_responsibilities._01_before;

public class RequestHandler {

    public void handler(Request request) {

        System.out.println(request.getBody());
    }
}
