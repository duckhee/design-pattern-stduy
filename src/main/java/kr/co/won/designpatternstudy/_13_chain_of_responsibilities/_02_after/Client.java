package kr.co.won.designpatternstudy._13_chain_of_responsibilities._02_after;

public class Client {

    private RequestHandler requestHandler;

    public Client(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public void doWork(String msg) {

        Request request = new Request(msg);
        requestHandler.handle(request);
    }

    public static void main(String[] args) {
        // 연결을 해주는 것
        RequestHandler chain = new AuthRequestHandler(new LogginRequestHandler(new PrintRequestHandler(null)));
        Client client = new Client(chain);
//        String body  = "이번 놀이는 뽑기입니다.";
        String body = "testing";
        client.doWork(body);
    }
}
