// # 2. Rentable 인터페이스를 구현하는
//      HomeAgency, CarAgency 클래스를 정의하세요.
//   - CarAgency의 rent()는 Car 클래스 인스턴스를 리턴 ==> implements
package main.java.ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {

    @Override
    public Car rent() { // Car 클래스 인스턴스를 리턴하라고 했기 때문
        return null;
    }
}
