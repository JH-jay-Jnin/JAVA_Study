/* 다음의Phone 클래스를상속한SmartPhone클래스를정의하세요.
   => model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화 함

   이어서, SmartPhoneExample 클래스로 SmartPhone의 인스턴스를 생성하여
   초기화가 올바른지 확인하세요.
 */
package main.java.ch07.sec03.exam02;

// 1. 부모인 Phone 클래스를 상속받겠다. == extends
public class SmartPhone extends Phone{

    // 2. 자식 생성자. 이 자식 생성자에서 부모 클래스 생성자 호출
    // ==> super() : 부모 기본 생성자 => 미작성 시 컴파일러가 구문을 자식 생성자 첫번째 줄에 자동으로 추가
    // 여기에서는, model과 color라는 매개변수를 갖는 부모 생성자로 호출되었다.

    public SmartPhone(String model, String color) {
        super (model, color);
        System.out.println("SmartPhone (String model, String color) 생성자 매개변수로 초기화 함!");
    }

}
