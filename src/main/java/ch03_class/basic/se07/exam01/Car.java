package main.java.ch03_class.basic.se07.exam01;

import org.w3c.dom.ls.LSOutput;

public class Car {
    // 속성(==필드)
    String model;
    String color;
    int maxSpeed;

    // 1. 속성을 설정했다면, Car라는 class를 new Car라는 객체로 만드는 것이다. => CarExample로 이동
    
    // 기능(== 생성자 + 메서드)
    // 생성자 : new 연산자를 통해서 객체가 생성될 때 
    //         생성된 객체의 필드값을 초기화 + 기능을 수행하게 역할 => 소괄호 () 로 표현

    // 기본 생성자
    public Car(){
        System.out.println("기본 생성자로 Car 객체 생성");
    }

    // 여기까지만 하면, Heap영역에는 null null 0이 model color maxSpeed에 저장된다.

    // 매개변수 생성자
    // ** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
    //              전달되는 값을 저장하는 변수
    public Car(String model) {
        System.out.println("매개변수 1개 생성자");
    }

    public Car(String model, String color){
        System.out.println("매개변수 2개 생성자");
    }

    public Car(String model, String color, int maxSpeed){
        System.out.println("매개변수 3개 생성자");
        System.out.println("model : "  + model);
        System.out.println("color : "  + color);
        System.out.println("maxSpeed : "  + maxSpeed);

        // 전달 받은 값을 필드에 초기화
        // - 객체가 자기 자신을 참조할 수 있도록 하는 변수
        // - 모든 객체 내부에 숨겨져 있다.

        // 사용 이유??
        // -> 필드명과 매개변수명이 같을 경우
        //    이를 구분하기 위해서 주로 사용함

        // ** this 참조 변수 **
        this.model = model;
        // 필드 = 매개변수 값
        // 현재 객체가 가지고 있는 필드 model(this.model)에
        // 매개변수 model 값을 대입
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // ** 오버로딩 (Over Loading : 넘치게 적재) **
    // - 클래스 내에 동일한 이름의 메소드(생성자 포함)를
    //   여러 개 작성하는 기법

    // -> 하나의 이름으로 여러 기능을 수행할 수 있게 해준다.

    // [오버로딩 조건]
    // 1. 메소드(생성자 포함)의 이름이 동일해야 한다.
    // 2. 매개변수의 개수, 타입, 순서 중 1개라도 달라야 한다.

    // 매개변수 개수, 타입이 같지만 순서가 다름 => 오버로딩 성립
    public Car(String model, int maxSpeed, String color) {
        // System.out.println("this 생성자");
        // *주의* : 반드시 this()는 첫 줄에 작성되어야 한다.
        
        this(model, maxSpeed); // Car 대신에 현재 만들어진 객체를 의미하는 this 생성자를 쓴다.
        // this 생성자 : 현재 객체의 다른 생성자를 호출
        // this() 사용 이유 : 중복 코드 제거, 코드 길이 감소, 재사용성 증가
        // (가독성이 어려운 경우가 생길 수 있어서 많이 사용되진 않는다.)

        // this.model = model;
        // this.maxSpeed = maxSpeed;
        this.color = color;
    }

    // 매개변수 개수와 타입이 다르므로 오버로딩이 성립한다!
    public Car(String model, int maxSpeed){
        this.model = model;
        this.maxSpeed = maxSpeed;

        System.out.println("오버로딩 적용");
    }

    // public Car(String brand, int minSpeed) {}
    // 매개변수명은 다르지만 개수, 타입, 순서가 동일하기 때문에
    // 에러 발생 (오버로딩 불가!!)
    // -> 매개변수명은 신경쓰지 않는다.



}
