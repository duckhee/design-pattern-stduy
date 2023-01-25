package kr.co.won.designpatternstudy._03_abstractfactory._03_java;

import kr.co.won.designpatternstudy._02_factorymethod._02_after.Ship;
import kr.co.won.designpatternstudy._02_factorymethod._02_after.WhiteShip;
import org.springframework.beans.factory.FactoryBean;

/**
 * Spring 이 제공을 해주는 interface 이다.
 * <p>
 * FactoryBean의 경우 Bean을 만들 때, 단순히 new 를 사용해서 만들 수 없고,
 * 복잡한 과정을 통해서 만들 경우 사용을 한다. 구현체를 만들어서 등록을 해준다.
 * FactoryBean은 추상 클래스가 된다.
 * 구현된 method에서 반환을 하는 값을 bean으로 등록이된다.
 */
public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new WhiteShip();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
