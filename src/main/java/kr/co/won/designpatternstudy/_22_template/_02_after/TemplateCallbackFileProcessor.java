package kr.co.won.designpatternstudy._22_template._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TemplateCallbackFileProcessor {


    private String path;

    public TemplateCallbackFileProcessor(String path) {
        this.path = path;
    }

    public int process(Operation operation) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while ((line = reader.readLine()) != null) {
                result = operation.getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException exception) {
            throw new IllegalArgumentException(path + "에 해당되는 파일이 없습니다.", exception);
        }
    }


}


