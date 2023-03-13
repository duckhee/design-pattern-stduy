package kr.co.won.designpatternstudy._03_behavioral_patterns._17_mediator._02_after;

public class CleaningService {

    private FrontDesk frontDesk;

    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
    }

    public void getTowers(Integer guestId, int numberOfTowers) {
        String roomNumber = this.frontDesk.getRoomNumberFor(guestId);

        System.out.println(numberOfTowers + " towers to " + guestId);
    }

    public void clean(String type, Integer id) {
        System.out.println("clean " + type + ", id : " + id);
    }
}
