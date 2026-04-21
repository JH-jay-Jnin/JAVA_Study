/* 다음의Phone 클래스를상속한SmartPhone클래스를정의하세요.
   => model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화 함

   이어서, SmartPhoneExample 클래스로 SmartPhone의 인스턴스를 생성하여
   초기화가 올바른지 확인하세요.
 */
package main.java.ch07.sec03.exam02;

public class SmartPhone extends Phone{
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
        super (model, color);
        System.out.println("SmartPhone (String model, String color) 생성자 매개변수로 초기화 함!");
    }

}
