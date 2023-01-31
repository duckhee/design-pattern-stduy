package kr.co.won.designpatternstudy._06_adapter._03_java;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {

    public static void main(String[] args) {
        // collection 부분에 적용이 된 Adapter Pattern
        List<String> strings = Arrays.asList("a", "b", "c");
        // enumeration 이 Adapter 가되고, List<String> 이 Adaptee 가 된다.
        Enumeration<String> enumeration = Collections.enumeration(strings);

        // adapter Pattern 이 적용이 된 부분을 파악하는 것이 도움이된다.
        // io
        try (InputStream is = new FileInputStream("input.txt")) { // FileInputStream 에 String 부분을 주고, 다른 타입을 반환을 받는 부분이 Adapter Pattern 이다.
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
}
