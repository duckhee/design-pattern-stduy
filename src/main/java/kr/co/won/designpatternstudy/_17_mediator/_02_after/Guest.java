package kr.co.won.designpatternstudy._17_mediator._02_after;

import java.time.LocalDateTime;

public class Guest {

    private Integer id;
    private FrontDesk frontDesk;

    public Guest() {
        this.frontDesk = new FrontDesk();
    }

    public Guest(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTower(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    public void clean(){
        this.frontDesk.clean(this);
    }

    public void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
