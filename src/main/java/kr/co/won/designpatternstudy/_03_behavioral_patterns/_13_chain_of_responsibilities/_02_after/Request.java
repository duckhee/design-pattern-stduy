package kr.co.won.designpatternstudy._03_behavioral_patterns._13_chain_of_responsibilities._02_after;

public class Request {
    private String body;

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
