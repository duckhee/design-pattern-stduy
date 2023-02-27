package kr.co.won.designpatternstudy._17_mediator._02_after;

import java.time.LocalDateTime;

public class Restaurant {

    private FrontDesk frontDesk;

    public Restaurant(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void dinner(Integer id, LocalDateTime dateTime) {
        frontDesk.getRoomNumberFor(id);
        System.out.println("dinner guest Id : " + id + ", dinner time : " + dateTime);
    }
}
