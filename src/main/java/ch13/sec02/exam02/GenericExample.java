// # 3. 앞에서 정의한 인터페이스와 클래스를 이용하여
//      다음 출력이 나오도록 수정하세요.

package main.java.ch13.sec02.exam02;

public class GenericExample {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();

    }
}
