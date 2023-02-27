package kr.co.won.designpatternstudy._17_mediator._02_after;

public class Gym {

    private Integer id;
    private FrontDesk frontDesk;

    public Gym(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void clean() {
        frontDesk.clean(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
