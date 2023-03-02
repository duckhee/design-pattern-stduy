package kr.co.won.designpatternstudy._19_observer._02_after;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// subject
public class ChatServer {

    // out of memory를 방지하기 위해서는 reference를 적절한 시점에 참조를 제거를 해줘야한다.
    // 불가능할 경우, WeakReference를 사용해서 제거를 해도 되지만, WeakReference는 제거 되는 시점이 불분명하기 때문에 적절한 대안은 아니다.
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void register(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).add(subscriber);
        } else {
            // list of 로 만들어서 주면 변경이 불가능하므로, ArrayList로 만들어서 제공을 해야한다.
            List<Subscriber> list = new ArrayList<>();
            list.add(subscriber);
            this.subscribers.put(subject, list);
        }
    }

    public void unregister(String subject, Subscriber subscriber) {
        if (this.subscribers.containsKey(subject)) {
            this.subscribers.get(subject).remove(subscriber);
        }
    }

    // 전파를 시키는 Method
    public void sendMessage(User user, String subject, String msg) {
        if (subscribers.containsKey(subject)) {
            String userMsg = user.getName() + " : " + msg;
            this.subscribers.get(subject).forEach(s -> s.handleMessage(userMsg));
        }
    }

}
