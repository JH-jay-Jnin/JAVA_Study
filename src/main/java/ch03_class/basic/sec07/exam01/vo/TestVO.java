package main.java.ch03_class.basic.sec07.exam01.vo;
// VO (Value Object) : 값 저장용 객체를 만들기 위한
//                     클래스를 모아두는 패키지
// 6. sout 쓰고 학생 객체 생성

class TestVO { // 5. public을 지워본다. = default로 정의한 것. 그리고 아래 주석을 읽는다.
    // 접근 제한자 (default) => 아무것도 안 써있는 경우 : 같은 패키지 내에서만 import 가능

    public void ex(){
        System.out.println("같은 패키지");

        // 학생 객체 생성
        Student ex = new Student();

        System.out.println(ex.v1);
        System.out.println(ex.v2);
        System.out.println(ex.v3);
        // System.out.println(ex.v4);
        // 7.v4는 Student 인스턴스 변수 생성 시, private이기 때문에 (Student에서 private으로 정의함)
        // 같은 패키지여도 다른 클래스에서 직접 접근 불가. 이후 ClsService로 이동


    }
}
