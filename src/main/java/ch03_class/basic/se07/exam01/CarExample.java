package main.java.ch03_class.basic.se07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저", 250, "검정");
        // Car myCar = new Car() ; // 기본 생성자 호출 못함
        // 2. new 연산자를 통해 객체를 만든다. => 새 주소로 초기화
        
        // 매개변수 2개짜리 생성자 (String, int)를 이용하여 객체 생성 후
        // car 참조변수에 대입
        Car car = new Car("드림카", 400);

        // myCar 객체 필드값 출력
        // 값이 안담긴 이유 : Car 필드에 초기화하지 않았기 때문에 해당 객체가 가진 field에 담아줘야 한다.
        System.out.println("---------------------------------------");
        System.out.println("model : "  + myCar.model); // null =>
        System.out.println("color : "  + myCar.color); // null =>
        System.out.println("maxSpeed : "  + myCar.maxSpeed); // 0 =>

        System.out.println("---------------------------------------");

        System.out.println("model : " + car.model);
        System.out.println("maxSpeed : " + car.maxSpeed);

    }
}
