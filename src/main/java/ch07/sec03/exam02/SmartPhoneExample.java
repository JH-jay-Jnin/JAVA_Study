/* 다음의Phone 클래스를상속한SmartPhone클래스를정의하세요.
   => model, color는 SmartPhone 클래스의 생성자 매개변수로 초기화 함

   이어서, SmartPhoneExample 클래스로 SmartPhone의 인스턴스를 생성하여
   초기화가 올바른지 확인하세요.
 */
package main.java.ch07.sec03.exam02;

public class SmartPhoneExample {

    public static void main(String[] args) {
        // SmartPhone 인스턴스 생성
        SmartPhone SmartEx = new SmartPhone("갤럭시", "은색");

        // Phone으로부터 상속 받은 필드 읽기 => model과 color라는 두 가지 필드가 있었다!
        System.out.println("모델 : " + SmartEx.model);
        System.out.println("색상 : " + SmartEx.color);
    }
}
