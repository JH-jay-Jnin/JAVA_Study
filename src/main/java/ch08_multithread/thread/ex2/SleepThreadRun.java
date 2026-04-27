package main.java.ch08_multithread.thread.ex2;

public class SleepThreadRun {
    public static void main(String[] args) {
        Thread ST = new Thread( new SleepThread() );
        // 인터페이스를 상속 받은 경우, 인자로 넣어주어야 한다.
        ST.start();
        // -> SleepThread의 run() 메서드 실행
    }
}
