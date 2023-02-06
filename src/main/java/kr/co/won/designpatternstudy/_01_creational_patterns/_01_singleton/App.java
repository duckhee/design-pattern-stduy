package kr.co.won.designpatternstudy._01_creational_patterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings instance = Settings.getInstance();
        Settings instance2 = Settings.getInstance();
        // 역직렬화한 객체를 불러오기 위한 변수
        Settings serializeInstance = null;
        // singleton pattern 을 깨트리는 방법
        Constructor<Settings> declaredConstructor = Settings.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Settings reflectionSettings = declaredConstructor.newInstance();
        System.out.println(instance2 == instance);
        System.out.println(instance2 == reflectionSettings);
        // 직렬화를 이용해서 파일에 객체를 쓰는 것
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(instance);
        }

        // 직렬화된 객체를 읽어오는 것
        // 역직렬화를 할때, 반드시 생성자를 이용해서 객체를 다시 만들어준다.
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            serializeInstance = (Settings) in.readObject();
        }
        System.out.println(instance == serializeInstance);
    }
}
