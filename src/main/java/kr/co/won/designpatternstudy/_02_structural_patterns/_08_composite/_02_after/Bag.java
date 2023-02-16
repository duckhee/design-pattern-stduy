package kr.co.won.designpatternstudy._02_structural_patterns._08_composite._02_after;

import java.util.ArrayList;
import java.util.List;

// Leaf type인 Item을 참조하면 안되고, Composite인 Component를 참조해서 활용을 해야한다.
public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
