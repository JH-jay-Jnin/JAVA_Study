package main.java.ch04_Inheritance_polymorphism.oop.model.service;

import main.java.ch04_Inheritance_polymorphism.oop.model.vo.Apple;
import main.java.ch04_Inheritance_polymorphism.oop.model.vo.Galaxy;
import main.java.ch04_Inheritance_polymorphism.oop.model.vo.Phone;

public class InheritanceService {

    // 11. void 작성
    public void ex1() {
        //상속 확인
        // - Phone을 상속 받은 Apple이
        //   Phone의 필드, 메서드 사용 가능?

        // new와 함께 객체 생성 그리고 이어서 Run으로 이동
        Phone phone = new Phone();

        System.out.println( phone.getColor());
        System.out.println("---------------------");

        // 13. 자식 객체 생성해서, 참조변수 Apple에 담기
        Apple apple = new Apple(); // => 처음에 입력하면 빨간줄 (import 문제) = 자동으로 그냥 import되게 엔터 치자

        // 13. Apple만의 고유한 메서드
        apple.setIosVersion("32.1버전");

        // 부모(Phone)로 부터 상속 받은 메서드
        apple.setColor("red");

        // 세팅된 값 출력
        System.out.println(apple.getIosVersion());
        System.out.println(apple.getColor());

        // 14. 다시 Phone에서 10. 생성자 쪽으로 간다. 간다.
        
        
    }
    
    //19. 
    public void ex2() {
        // 오버라이딩 확인 예제
        // 오버라이딩(OverRiding) : 부모로부터 물려받은 메소드를 자식이 재정의 하는 것

        Galaxy galaxy = new Galaxy();

        galaxy.pay(); // 부모로부터 물려받은 메소드 pay의 경로를 마우스를 올려 확인해보자 ==> Phone에서 받은게 맞음
                      // 20. 이어서 Run 가서 실행해보자
                      // 21. 오버라이딩을 안했으니깐 Phone 메서드가 수행된다. 따라서 다시 고쳐보자. 이어서 Galaxy 맨 아래로

        //26.
        galaxy.pay();; // 오버라이딩 0 => Galaxy 메서드 수행
        // 마우스 올려보면 galaxy에 반영됐음을 알 수 있다. == 21.의 문제 해결!

        System.out.println("-----------------------------");

        // 27. toString()
        Phone phone = new Phone("아이폰 24", "Cyan");
        Apple apple = new Apple("아이폰 XS", "RoseGold", "3버전");

        System.out.println(phone.toString()); //그리고 실행해보자! Phone@404b9385 이런 결과가 나오므로 자식이 재정의하자
        // 28. Phone 아래로 가자

        //29.
        System.out.println(apple.toString()); // 실행해보자 => 결과는 Phone toString()에서 재정의한걸로 물려받게 된다.
        // 그런데 apple에서 iosVErsion이 출력 안된다. 따라서 30. Apple로 가서

        // 31.
        System.out.println(apple);
        // print 수행 시 참조 변수명만 작성하는 경우, 자동으로 toString 메서드 호출해서 출력한다.


    }
    // 32.
    public void ex3 () {
        Galaxy g = new Galaxy(); // ctrl 누르고 Galaxy를 누르면 이동한다.
    }
}
