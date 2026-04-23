package main.java.ch04_Inheritance_polymorphism.oop.model.service;

import main.java.ch04_Inheritance_polymorphism.oop.model.vo.Apple;
import main.java.ch04_Inheritance_polymorphism.oop.model.vo.Galaxy;
import main.java.ch04_Inheritance_polymorphism.oop.model.vo.Phone;

public class PolyService {

    public void ex1(){
        // 2. 다형성 확인 예제

        // Phone 객체 생성
        Phone phone = new Phone();
    // 부모타입 참조변수 = 부모객체  를 담은 것이다. ( 한 가지 객체로 한가지만 담은 것이라 아직 다향성 X)

        // Apple 객체 생성
        Apple apple = new Apple();
    // 자식타입 참조변수 = 자식객체  를 담은 것이다. (==> 다형성 X)

        // ******* 다형성 (업캐스팅) *******

        Phone phone2 = new Apple();
    // 부모타입 참조변수 = 자식객체  를 담고 있다. => 다형성 업캐스팅은 부모타입 참조변수로 자식객체를 담는 것.
        // -> 오류 발생 안함!
        // 왜? Apple 객체를 참조하는 변수(phone2)의 타입이
        // 부모이기 때문에 Apple 객체가 Phone 객체로 변화함.

        Phone phone3 = new Galaxy(); // 얘도 마찬가지로, 서로 타입이 다르지만, Heap영역 내부에 있는 부모를 참조

        // 1) 자식 객체가 부모 객체로 변했기 때문에
        //    자식만의 고유한 필드, 메소드 사용 불가 ==> 다운캐스팅이 나온 이유.

        // 1-1) phone(부모 = 부모   : Phone phone = new Phone(); 이걸 뜻함)
        phone.setModel("옵티머스");
        phone.setColor("white");
        // Phone 메소드 전부 사용 가능 ( 부모 = 부모 이기 때문에 )

        // 1-2) apple (자식 = 자식  : Apple apple = new Apple(); 이걸 뜻함)
        apple.setIosVersion("12.4");
        // Apple 메서드 전부 사용 가능 ( 자식 = 자식 이기 때문에 )
        // 즉, 다형성이 적용되지 않으면, 같은 참조 내에서 무리 없이 사용할 수 있다.

        // 1-3) phone2(부모 = 자식(Apple))
       // phone2.setIosVersion("10"); // 'Phone'의 메서드 'setIosVersion'을(를) 해결할 수 없습니다. 라는 오류
                                    // 부모만을 참조하고 있기 때문에, 자식 = 자식을 참조할 수 없다. (접근 X)

        // ---------------------------------------------------------------

        // 2) 다형성을 이용한 객체 배열

        // 객체 배열 : 같은 참조 자료형의 변수를 묶음으로 다루는 것.
        // -> 각 요소 하나가 참조 변수이다. ( 주소를 갖는다 )

        // * 다형성 적용
        // -> 부모 타입 참조변수를 묶음으로 다루는 것. ==> 자식 객체도 활용 가능!
        // ** 부모타입 참조변수로 자식객체를 참조하는 것 **


        Phone[] arr = new Phone[3];
        // 부모타입 참조변수(arr)에 배열 선언 및 할당
        // 각 배열 요소가 Phone 타입 참조 변수가 된다. => Phone 배열이기 때문에

        arr[0] = phone; // Phone 주소를 가지고 있다. == Phone 객체이다!
    // 부모타입 = 부모객체(본인)

        arr[1] = phone2; // Apple 주소를 가지고 있다. == Apple 객체이다!
        // 다형성 업캐스팅! (부모 -> 자식)
    // 부모타입 = 자식객체(본인 아님 => 다형성 업캐스팅 적용)

        arr[2] = phone3; // Galaxy 주소를 가지고 있다. == Galaxy 객체이다!
        // 다형성 업캐스팅! (부모 -> 자식)
    // 부모타입 = 자식객체(본인아님 => 업캐스팅)
        // 원래 같은 자료만 들어와야하는데, 업캐스팅이 적용되면 다른 자료도 적용된다!

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "번째 인덱스 : ");
            arr[i].pay();

        }
    }
}

