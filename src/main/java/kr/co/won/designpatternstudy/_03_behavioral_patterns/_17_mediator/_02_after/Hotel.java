package kr.co.won.designpatternstudy._03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class Hotel {

    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        Guest guest = new Guest(frontDesk);
//        Guest guest = new Guest();
        guest.setId(1);
        guest.getTower(10);
        guest.dinner(LocalDateTime.now());
    }
}
