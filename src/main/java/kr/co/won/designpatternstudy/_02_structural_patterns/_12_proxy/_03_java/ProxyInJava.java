package kr.co.won.designpatternstudy._02_structural_patterns._12_proxy._03_java;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxy = new ProxyInJava();
        proxy.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameService = getGameServiceProxy(new DefaultGameService());
        gameService.startGame();
    }

    // java의 reflection을 이용한 Proxy 생성 -> interface를 가지고 사용을 한다는 단점이 있다.
    private GameService getGameServiceProxy(GameService gameService) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{GameService.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("0");
                method.invoke(gameService, args);
                System.out.println("ㅁ");
                return null;
            }
        });
    }
}
