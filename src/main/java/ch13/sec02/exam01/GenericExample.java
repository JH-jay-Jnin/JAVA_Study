// # 5. Product, Tv, Car 등이 클래스를 이용하여
//      아래 코드를 완성하세요.

package main.java.ch13.sec02.exam01;

public class GenericExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product();
        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        Product<Car, String> product2 = new Product();
        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car= product2.getKind();
        String carModel= product2.getModel();

        // 확인용 코드 ( 실습교안에서는 위 코드만 짜고 끝내는 것)
        System.out.println(tv);          // Tv@주소값 (toString 오버라이딩 안했으니까)
        System.out.println(tvModel);     // 스마트Tv
        System.out.println(car);         // Car@주소값
        System.out.println(carModel);    // SUV 자동차

    }
}
