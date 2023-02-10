package kr.co.won.designpatternstudy._11_flyweight._02_after;

import java.util.HashMap;
import java.util.Map;

// flyweight Factory 에 해당이 된다.
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            return newFont;
        }
    }

}
