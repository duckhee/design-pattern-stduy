package kr.co.won.designpatternstudy._03_behavioral_patterns._17_mediator._01_before;

public class Gym {
    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }
}
