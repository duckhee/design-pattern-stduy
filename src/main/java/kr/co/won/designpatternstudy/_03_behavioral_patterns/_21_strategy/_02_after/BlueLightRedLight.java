package kr.co.won.designpatternstudy._03_behavioral_patterns._21_strategy._02_after;

// context로 남아 있는 class이다.
public class BlueLightRedLight {

    // 전략을 가지고 일을 진행을 하는 것 구체적인 type에 의존하지 않고 전략을 사용해서 처리한다.
    private Speed speed;

    public BlueLightRedLight(Speed speed) {
        this.speed = speed;
    }

    public void blueLight(){
        speed.blueLight();
    }

    public void redLight(){
        speed.redLight();
    }
    public void blueLight(Speed sp){
        sp.blueLight();
    }

    public void redLight(Speed sp){
        sp.redLight();
    }
}
