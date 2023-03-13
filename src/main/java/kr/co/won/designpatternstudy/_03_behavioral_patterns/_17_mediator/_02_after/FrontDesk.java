package kr.co.won.designpatternstudy._03_behavioral_patterns._17_mediator._02_after;


import java.time.LocalDateTime;

public class FrontDesk {

    // Colleague 모든 component를 알고 있어도 된다.
    private CleaningService cleaningService = new CleaningService(this);
    private Restaurant restaurant = new Restaurant(this);


    public void getTowers(Guest guest, int numberOfTowers) {
        System.out.println("guest = " + guest.getId());
        // 각각의 서비스에게 필요한 정보만 넘겨준다.
        cleaningService.getTowers(guest.getId(), numberOfTowers);
    }

    public String getRoomNumberFor(Integer guestId) {
        return "1111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }

    public void clean(Gym gym) {
        cleaningService.clean("gym", gym.getId());
    }

    public void clean(Guest guest) {
        cleaningService.clean("guest", guest.getId());
    }
}
