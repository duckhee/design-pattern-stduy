package kr.co.won.designpatternstudy._04_builder._02_after;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁 식사")
                .getPlan();
        System.out.println("plan = " + plan);
        TourPlan shorTour = builder.title("롤비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
        System.out.println("shorTour = " + shorTour);
        TourDirector director = new TourDirector(builder);
        TourPlan cancunTrip = director.cancunTrip();
        System.out.println("cancunTrip = " + cancunTrip);
        TourPlan longBeachTrip = director.longBeachTrip();
        System.out.println("longBeachTrip = " + longBeachTrip);
    }
}
