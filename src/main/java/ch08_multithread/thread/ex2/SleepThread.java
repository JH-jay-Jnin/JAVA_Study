package main.java.ch08_multithread.thread.ex2;

public class SleepThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "실행");

        for(int i =1; i<=10; i++){
            // Thread.sleep( long millis )
            // - 현재 스레드를 지정된 시간만큼 일시정지
            // - 시간은 1/1000초 단위(ms)로 지정
            // - InterruptedException 예외 처리 필요 == 무조건 처리해야하는 예외
            try {
                Thread.sleep(1000); // 1초 ms
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
                // 보통은 e.printStackTrace();를 써서 예외가 발생한 위치와 흐름을 출력한다.
            }

            System.out.println(i + "초");
        }
    }
}
