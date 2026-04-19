package main.java.ch03_class.basic.se07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", "검정", 250);
        // Car myCar = new Car() ; // 기본 생성자 호출 못함

        Car myCar2 = new Car();

        // myCar 객체 필드값 출력
        // 값이 안담긴 이유 : Car 필드에 초기화하지 않았기 때문에 해당 객체가 가진 field에 담아줘야 한다.
        System.out.println("---------------------------------------");
        System.out.println("model : "  + myCar.model);
        System.out.println("color : "  + myCar.color);
        System.out.println("maxSpeed : "  + myCar.maxSpeed);
    }
}
