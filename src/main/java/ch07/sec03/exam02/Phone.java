/* 다음의Phone 클래스를상속한SmartPhone클래스를정의하세요.
   => model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화 함

   이어서, SmartPhoneExample 클래스로 SmartPhone의 인스턴스를 생성하여
   초기화가 올바른지 확인하세요.
 */

package main.java.ch07.sec03.exam02;

public class Phone {
    // 1. 필드선언
    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }
}
