package kr.co.won.designpatternstudy._01_creational_patterns._04_builder._02_after;

import java.time.LocalDate;
import java.util.ArrayList;

public class ObjTourBuilder implements TourPlanBuilder {

    private TourPlan tourPlan;

    private ObjTourBuilder() {

    }

    @Override
    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        tourPlan.setDays(days);
        tourPlan.setNights(nights);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (tourPlan.getPlans() == null) {
            tourPlan.setPlans(new ArrayList<>());
        }
        tourPlan.addPlan(day, plan);
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
