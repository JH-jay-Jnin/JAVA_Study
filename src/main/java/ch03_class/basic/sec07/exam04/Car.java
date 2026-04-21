package main.java.ch03_class.basic.sec07.exam04;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자 오버로딩
    // => 같은 이름의 생성자를 매개변수 개수, 타입, 순서 중 하나를 다르게 해서 선언.

    // 1. 디폴트 생성자
    public Car() {}

    // 2. 매개변수로 model만 가지는 생성자
    public Car(String model) {
        this.model = model;
    }

    // 3. 매개변수로 model과 color를 가지는 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // 4. 매개변수로 model과 color, maxSpeed를 가지는 생성자
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
