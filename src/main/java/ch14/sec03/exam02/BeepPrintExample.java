// #1. 다음에 정의한 두 작업을 각각의 스레드에서 수행하도록 프로그램을 작성하세요.

/*
* 작업 1: 0.5초 간격으로 비프음 출력
    * => Runnable 인터페이스를 이용하여 작업 스레드에서 실행
* 작업 2: 0.5초 간격으로 "띵" 문자열 출력
    * => Main 스레드에서 실행
 */


// +) Java 규칙상 오버라이딩 할 때 부모보다 더 넓은 예외를 던질 수 없다. (문법적으로 불가능!)
//      => throws InterruptedException을 안쓰고 try/catch로 내부처리한 이유.

// ++) ToolKit : Java 패키지에 있는 클래스로, 현재 시스템의 ToolKit 인스턴스를 가져오는 방식
//              => Toolkit.getDefaultToolkit()으로 사용 (싱글톤 패턴)
//                  여기서 beep()은 시스템 비프음 출력이라는 내장된 클래스이다.


// +++) @Override
//            public void run() { // 부모가 throws를 선언 안했기에, 오버라이딩 하는 자식도 throws 추가 X
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for (int i = 0; i < 5; i++) {
//                    toolkit.beep();
//                    Thread.sleep(500);

// => 이렇게 까지 입력하면, Thread.sleep(500);은 throws InterruptedException을 선언하고 있어서
//    자동으로 감지하고 try / catch 둘러싸기 옵션을 제안하는 것이다.

package main.java.ch14.sec03.exam02;

import java.awt.*;
import java.lang.Runnable;

public class BeepPrintExample {
    public static void main(String[] args) {
        // 작업 2 => Main 스레드에서 실행

        // 작업 스레드 생성
        Thread thread = new Thread(new Runnable() {
            // Runnable이 인터페이스라 원래 직접 new를 못하는데
            // 뒤에 {}로 구현부를 바로 작성해서 객체로 만드는 방식 사용
            @Override
            public void run() { // 부모가 throws를 선언 안했기에, 오버라이딩 하는 자식도 throws 추가 X
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500); //
                    } catch (InterruptedException e) {
                        // throw new RuntimeException(e); ==> 예외가 발생해도 넘어가는 단계
                }

            }
        }
    }
    }
}
