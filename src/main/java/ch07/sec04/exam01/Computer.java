/* #. Calculator를상속한Computer 클래스를정의하고,
        areaCircle() 메서드를 재정의하세요

    => Computer 클래스의 areaCircle()은
       Math.PI 상수를 이용해 계산함.
*/

package main.java.ch07.sec04.exam01;

// #1. 부모인 Calculator를 상속한 자식 computer
public class Computer extends Calculator {

// #2. 부모 Calculator의 메소드를 오버라이딩
    @Override
    public double areaCircle(double r) {
        System.out.println("computer 객체의 areaCircle() 실행");
        return super.areaCircle(r);
    }
}
