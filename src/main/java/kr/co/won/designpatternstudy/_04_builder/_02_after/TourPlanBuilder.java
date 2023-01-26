package kr.co.won.designpatternstudy._04_builder._02_after;


import java.time.LocalDate;

public interface TourPlanBuilder {

    // 객체를 생성해서 중복 field 값을 제거하기 위한 method
    default TourPlanBuilder newInstance() {
        return null;
    }

    // 다음과 같이 return type 을 주는 method chain을 이용하기 위해서 해당되는 interface를 반환을 해주는 것이다.
    TourPlanBuilder title(String title);

    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    // 이 method를 호출할 경우 만들고 싶은 객체가 반환이 된다. -> method chain이 끝난다.
    TourPlan getPlan();

}
