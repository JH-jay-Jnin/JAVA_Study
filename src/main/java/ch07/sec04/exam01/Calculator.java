/* #. Calculator를상속한Computer 클래스를정의하고,
        areaCircle() 메서드를 재정의하세요

    => Computer 클래스의 areaCircle()은
       Math.PI 상수를 이용해 계산함.
*/

package main.java.ch07.sec04.exam01;

public class Calculator {
    // 메소드 선언
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle() 실행");
        return 3.1415 * r * r;
    }
}
