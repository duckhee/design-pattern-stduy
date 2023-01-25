package kr.co.won.designpatternstudy._03_abstractfactory._03_java;

import kr.co.won.designpatternstudy._02_factorymethod._02_after.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanExample {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship ship = applicationContext.getBean("whiteship", Ship.class);
        System.out.println(ship.getName());

        ApplicationContext context = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        ShipFactory shipFactory = context.getBean(ShipFactory.class);
        Ship whiteShip = context.getBean(Ship.class);
        System.out.println(shipFactory);
        System.out.println(whiteShip);
    }
}
