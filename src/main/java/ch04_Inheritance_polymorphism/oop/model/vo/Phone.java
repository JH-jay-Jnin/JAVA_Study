package main.java.ch04_Inheritance_polymorphism.oop.model.vo;

public class Phone { // 5. 다시 Apple로 이동
   // 10. private 넣고 기본생성자, getter setter 작성
    private String model;
    private String color;

    // 33.
    public Phone(){
        System.out.println("Phone 기본 생성자 호출");
    }

    // 10. 기본생성자
    // public Phone () {}

    // 14. 매개변수 2개짜리 생성자 직접 작성 ==> (전달받은 변수를 통해) 값을 초기화하고 기능을 추가하려고
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        // 15. this 참조변수를 안 쓰면 현재파일 내에서 private String model과 매개변수 model이 충돌하기 때문에 오류가 생긴다.
        // 16. 이어서 Apple에 생성자쪽으로 넘어간다.
        System.out.println("매개변수 생성자 실행");
    }

    // 10. getter setter 생성
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 이어서 InheritanceService로 이동

    // 18. 메서드
    public void  pay () {
        System.out.println("결제하기"); // 부모한테만 결제하기를 만들고, 이어서 자식에게도 줄 수 있는지 확인한다. 이어서 19. 서비스로
    }

    //28. Object.toString() 메서드 오버라이딩
    // toString() : 객체가 가지고 있는 모든 값(필드)
    //              하나의 문자열로 반환하는 용도의 메서드
    @Override
    public String toString(){
        return model + " / " + color; // 그리고 다시 실행해보자 그러면 아이폰 24 / Cyan 가 잘 나온다! 29. Service로 가서
    }
}
