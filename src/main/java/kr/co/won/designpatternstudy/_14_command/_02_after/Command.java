package kr.co.won.designpatternstudy._14_command._02_after;

// 유사한 것으로는 Java의 Runnable과 비슷하다. -> java의 Thread 관련 interface
// receiver가 어떻게 쓰이는지 알고 있어야하는 class를 구현을 하는 것이므로 Receiver 쪽과 연결이 되어 있다.
// receiver의 변경이 일어 났을때, invoker의 변경이 아니라 command Pattern의 구현체에서 변경을 해주면 되므로 변경의 범위가 줄어드는 장점이 있다.
public interface Command {

    void execute();

    void undo();
}
