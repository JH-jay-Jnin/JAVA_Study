package main.java.ch04_Inheritance_polymorphism.oop.model.vo;

public class Galaxy extends Phone { // 3. String boolean 작성
    // 4. Apple과 Galaxy에 공통된 속성들만 Phone에 모아두자! => Phone으로 이동

    // 9. extends Phone 작성 후, private, getter setter 작성
//    String model;
//    String color;
    private boolean foldable;


    //  17. 매개변수 생성자 ==> 부모한테 직접 접근 불가하니 super를 쓴다.
    public Galaxy(String model, String color, boolean foldable){
        super(model, color);
        this.foldable = foldable;
    } // 오버로딩 : 같은 메소드명 사용가능 ==> 파라미터  개수, 순서, 타입 중 하나라도 달라야 한다.
      // 18. Phone 최하단으로 간다.

    // 9. alt + insert => constructor
    public Galaxy() {
        //32.
        // 35. 부모의 기본 생성자 호출
        // super == Phone
        super(); // 이것은 super() 생성자이다
        // * super() 미작성 시 컴파일러가 자동으로 추가해준다.
        System.out.println("Galaxy 기본 생성자 호출"); // => 33. Phone으로 간다.

        // 34.Galaxy 객체 생성 시
        // 내부에 상속 받은 Phone 객체를 생성하기 위한
        // Phone 생성자 호출 코드가 필요하다.


    }
    
    // 9. alt + insert => getter and setter => 이어서 Phone으로 이동

    public boolean isFoldable() {
        return foldable;
    }

    public void setFoldable(boolean foldable) {
        this.foldable = foldable;
    }
    
    // 23. 오버라이딩 성립 조건 => 반환형 메소드 명은 동일하게 써라 (Phone과 똑같이)
    // 25. Phone으로 부터 상속 받은 메서드 중
    //     pay() 메서드를 Galaxy에 맞게 재정의 (== 오버라이딩) 했다.
    // @Override 어노테이션 : 해당 메서드가 오버라이딩 되었음을 알려주는 역할이다. => 개발자한테도 알아볼 수 있게 해주는 좋은 안내사항이다
    // 어노테이션 (Annotation) : 컴파일러에게 알려주기 위한 코드
    // 26. 이어서 Service로 가서
    @Override
    public void pay(){
        System.out.println("부모로 부터 물려받은 메서드 재정의");
        System.out.println("삼성 페이로 결제하기");
        // 24. Run으로 가서 실행해보자!
    }
    
}
