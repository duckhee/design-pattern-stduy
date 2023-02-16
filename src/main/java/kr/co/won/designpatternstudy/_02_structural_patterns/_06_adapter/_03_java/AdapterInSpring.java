package kr.co.won.designpatternstudy._02_structural_patterns._06_adapter._03_java;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

public class AdapterInSpring {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        // controller에서 반환을 처리 해주는 handler 이다. -> frontHandler
        HandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();

    }
}
