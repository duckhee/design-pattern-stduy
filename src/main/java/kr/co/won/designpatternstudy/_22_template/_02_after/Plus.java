package kr.co.won.designpatternstudy._22_template._02_after;


public class Plus extends FileProcessor {

    public Plus(String path) {
        super(path);
    }

    @Override
    protected int getResult(int result, int lineNumber) {
        return result += lineNumber;
    }


}
