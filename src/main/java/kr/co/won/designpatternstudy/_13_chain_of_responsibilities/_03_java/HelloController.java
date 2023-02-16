package kr.co.won.designpatternstudy._13_chain_of_responsibilities._03_java;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping( path = "/hello")
    public String hello(){
        return "hello";
    }
}
