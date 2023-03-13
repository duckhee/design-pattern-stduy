package kr.co.won.designpatternstudy._03_behavioral_patterns._21_strategy._02_after;

public class Client {

    public static void main(String[] args) {
        // 다음과 같은 코드는 Comparator 에서 사용을 많이 한다.
        BlueLightRedLight light = new BlueLightRedLight(new NormalSpeed());
        light.blueLight();
        light.redLight();
        light.blueLight(new Faster());
        light.redLight(new Fastest());


        light.blueLight(new Speed() {
            @Override
            public void blueLight() {
                System.out.println("blue Light");
            }

            @Override
            public void redLight() {
                System.out.println("red Light");
            }
        });


    }
}
