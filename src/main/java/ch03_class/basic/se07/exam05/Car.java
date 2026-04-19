package main.java.ch03_class.basic.se07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 디폴트 생성자 (매개변수 없음)
    // - 매개변수 있는 생성자를 직접 만들면 자동생성 안되므로 직접 선언
    Car() {}

    Car(String model) {
        this(model, "은색", 250);  // 3개짜리 생성자 호출
    }

    Car(String model, String color) {
        this(model, color, 250);   // 3개짜리 생성자 호출
    }

    Car(String model, String color, int maxSpeed) {
        // - 실제 필드 초기화는 여기서만 수행
        // - this. : 현재 객체의 필드를 가리킴 (필드명과 매개변수명 구분)
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}