package kr.co.won.designpatternstudy._03_behavioral_patterns._22_template._02_after;


public class Client {

    public static void main(String[] args) {
        // template pattern
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process();
        System.out.println("result = " + result);
        // template callback pattern
        TemplateCallbackFileProcessor processor = new TemplateCallbackFileProcessor("number.txt");
        int result2 = processor.process((result1, line) -> result1 += line);
        System.out.println("result2 = " + result2);
    }
}
