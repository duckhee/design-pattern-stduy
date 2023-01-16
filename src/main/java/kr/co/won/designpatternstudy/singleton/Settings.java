package kr.co.won.designpatternstudy.singleton;

import java.io.Serializable;
import java.util.Set;

public class Settings implements Serializable {

    private static Settings settings;
    private static final Settings EASY_INIT = new Settings();

    // volatile 은 메인 메모리에 저장하겠다는 것을 나타낸다.
    private static volatile Settings instance;

    private Settings() {

    }

    /*public static Settings getInstance() {
        return new Settings();
    }*/

    /**
     * static 함수를 이용해서 단 하나의 객체를 보장 하는 방법
     * multi Thread 의 경우 현재 방법은 안전하지 않다.
     */
    public static Settings getInstance() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }

    /**
     * multi Thread 환경에서는 동시성 이슈로 인한 문제로 항상 동일한 객체임을 보장을 하지 못하므로
     * synchronized 라는 키워드로 동기화를 시켜줘야한다.
     */
    public synchronized static Settings getSyncInstance() {
        if (settings == null) {
            settings = new Settings();
        }
        return settings;
    }

    /**
     * 이른 초기화 방법
     * -> 처음에 객체를 생성을 해서 가지고 있는 방법
     * 이와 같은 경우는 해당되는 객체를 생성을 초기에 하는 것이 비용적인 부분에서 별로 들지 않을 경우 사용을 한다.
     */
    public static Settings eagerInitialization() {
        return EASY_INIT;
    }

    /**
     * 필요한 부분만 Lock 을 걸어서 사용을 하는 방법
     * double checked locking 을 이용한 방법
     */
    public static Settings getSyncInstanceMix() {
        if (instance == null) {
            // Setting 이라는 class 를 lock 으로 설정을 해주는 것
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }

    /**
     * static inner class 사용하여 singleton 구현
     */
    private static class SettingHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getStaticInstance() {
        return SettingHolder.INSTANCE;
    }

    // 역직렬화를 할때, 동일한 객체를 반환하기 위해서 사용하는 것
    // 이 method 는 역직렬화를 할 때, 사용이 되는 method 이다.
    protected Object readResolve() {
        return getStaticInstance();
    }
}
