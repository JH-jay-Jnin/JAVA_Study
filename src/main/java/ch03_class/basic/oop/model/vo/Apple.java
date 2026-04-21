package main.java.ch03_class.basic.oop.model.vo;

// 1. 5개 Class 전부 만들었으면 여기서부터 시작 => //속성 // 메서드 작성

public class Apple extends Phone { // 7. extends작성 및 아래 주석 확인
    // Apple 클래스에 Phone 클래스의 내용을 확장/연장한다. (Phone이 가진 model color를 물려받는다.)
    // == Apple 클래스에 Phone 클래스의 내용(필드, 메소드)을 추가하여 확장 ==> Phone이 부모 / Apple이 자식

    // 8. 위에서 이미 extends 했기 때문에 아래 2. 속성작성과 getter setter 일부를 지워준다. (난 일단 주석처리)
    // 이어서 Galaxy로 가서 상속 받고 getter | setter 작성하기 

//    // 2. 속성 작성 => Apple 만이 가지는 model color iosVersion 작성. 이어서 Galaxy로 이동
//        private String model;
//        private String color;
        private String iosVersion;

    //6. 생성자 및 메서드 생성 + 속성을 private으로 지정

    // 생성자
//    public Apple(String model, String color, String iosVersion) {
//        this.model = model;
//        this.color = color;
//        this.iosVersion = iosVersion;
//    }

    public Apple() {
    }

    // 16.
    public Apple(String model, String color, String iosVersion){
        // 전달 받은 값 중 model, color는 부모 필드에 세팅 ( 우리 눈에는 안 보이지만 현재 model이 있기 때문에)
        // 16. this.model = model; // private access가 뜬다!
        //     =>  Phone으로부터 상속 받은 부모의 필드(model)을 자식의 필드처럼 사용하려 했으나 오류 발생

        // 왜? => 부모 필드에 private 접근 제한자가 있어서
        // 물려 받은 자식이여도 직접 접근이 불가하다.
        // => 따라서 간접 접근 방법 (getter | setter)를 사용해야한다.
        
        // 16. getter setter 설정하기 ==> Phone에서 만든 getter setter를 참고한 다음 작성하자!
        
        // setModel(model);
        // setColor(color);
        // -> 부모의 setter를 이용했다
        
        //16. isoVersion도 받아보자! ==> 이건 Apple class 내에 있으니깐 (내꺼니깐) this 작성
        // 하지만, 이것은 비효율적인 방법이다.
        // 이젠 Phone (부모)에게서 가져와서 세팅하고 싶다.
        
        // 16. super : 상위 <-> sub : 하위
        // super == Phone
        // 반드시 자식 생성자 최상단에 작성되어야 한다. ( + setModel을 쓸 필요가 없다.)
        // 17. 이어서 Galaxy로 넘어가서 매개변수 생성자 작성한다.
        super(model, color);
        this.iosVersion = iosVersion;

        System.out.println("Apple 생성자 실행");
    }
    
    

    // 메서드(기능) ==> atl + insert로 getter setter로 생성
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    public String getIosVersion() {
        return iosVersion;
    }

   public void setIosVersion(String iosVersion) {
        this.iosVersion = iosVersion;
    }

   // 30. Phone.toString() 오버라이딩
   @Override
    public String toString() {
        // return getModel() + " / " + getColor() + " / " + iosVersion ; // 이러면 model이 private 액세스 뜬다. == getter쓴다. 아이폰 XS / RoseGold / 3버전 잘된다.
       // 하지만 위 방식보다 더 쉬운 방법이 있다. 아래 참고
       return super.toString() + " / " + iosVersion; // 결과는 같다!
       // this : 참조변수 | this() : 생성자 | super : 참조변수 | super() : 부모생성자
       // 31. 다시 Service로 돌아간다.
   }

}
