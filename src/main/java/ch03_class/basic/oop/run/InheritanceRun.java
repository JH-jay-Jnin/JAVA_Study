package main.java.ch03_class.basic.oop.run;

import main.java.ch03_class.basic.oop.model.service.InheritanceService;

public class InheritanceRun {
    // 12.main 메소드 생성 => null이 나오는 이유 : 객체 생성되면 자동으로 필드를 초기화해주기 때문이다.
    // 13. 이어서 다시 Service로 돌아간다.
    public static void main(String[] args) {
        InheritanceService service = new InheritanceService();
        // service.ex1(); // 상속 확인 예제
        // service.ex2();   // 20. 오버라이딩 확인 예제 ==> 실행 창에서 결제하기가 뜨면 된다! 21. 이어서 Service로
        service.ex3();
    }
}
