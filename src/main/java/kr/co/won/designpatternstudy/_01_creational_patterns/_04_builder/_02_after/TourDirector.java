package kr.co.won.designpatternstudy._01_creational_patterns._04_builder._02_after;


import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder builder;

    public TourDirector(TourPlanBuilder builder) {
        this.builder = builder;
    }

    public TourPlan cancunTrip() {
        return builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return builder.title("롤비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
