package main.java.ch03_class.basic.sec07.exam01.service;

import main.java.ch03_class.basic.sec07.exam01.vo.People;
import main.java.ch03_class.basic.sec07.exam01.vo.Student;

// 8. Service : 특정 기능 (비즈니스 로직)을 제공하는 클래스
public class ClsService extends Student { // 12. 상속 : Student가 가진 속성과 기능을 마치 ClsService가 extends하여 내껏처럼 사용

    public void ex1() {
        // 9. 클래스 접근 제한자 확인하기

        Student ex = new Student();
        // public class인 Student는 import 가능하다! => Student.java 7열에 public class Student로 정의됨!


        // TestVO test = new TestVO();
        // 10 .(default) class인 TestVO는 6열에서 class TestVO로 정의했다.
        // 즉, 다른 패키지여서 import 불가능

        System.out.println("다른 패키지");
        System.out.println(ex.v1);
        // 11. 다른 패키지에서도 접근 가능한 public만 에러 X
//        System.out.println(ex.v2);
//        System.out.println(ex.v3);
//        System.out.println(ex.v4;

        // 12. 상속관계 아래 주석까지 입력한 다음 ClsRun으로 간다.
        System.out.println("상속 관계");
        System.out.println(v1);
        System.out.println(v2);
        // 상속관계 : protected 직접 접근 가능
        // System.out.println(v3);
        // System.out.println(v4);
    }

    public void ex2() {
        // 17. static 필드 확인 예제

        // 18. 학생 개체 2개 생성
        Student st1 = new Student();
        Student st2 = new Student();
        
        // 19. 학생 객체에 name 세팅 이후 Student로 다시 돌아가서
        // st1.name = "백지헌"; // 직접 접근 => 아무나 막 접근할 수 있다.

        // 22. 간접 접근 방법 setter
        st1.setName("백지헌");
        st2.setName("이새롬");

        // 23. 정보 출력 => Student 값 얻어오기 위해서 getter를 이용한다. 그리고 ClsRun으로 간다.
        System.out.println(st1.getName());
        System.out.println(st1.schoolName);

        // 25. ** static이 붙은 필드 (변수)는 클래스명.변수명으로 작성! => 위처럼 st1이 아닌 student로 접근
        // => public이기 때문에 직접 접근 가능
        System.out.println(st2.getName());
        // System.out.println(Student.schoolName); // 정석 => 아래에서 문제가 발생하는 일이 있기 때문에 이것이 정석이라고 하는 것이다.

        // 26. 테스트 => schoolName 변경
        System.out.println(st2.getName());
        System.out.println(st2.schoolName);

        // schoolName 변경
        st1.schoolName = "KB유치원";
        System.out.println("변경 후 st1의 학교 : "  + st1.schoolName);

        System.out.println("st2의 학교 : " + st2.schoolName); // KB대학원 X => KB유치원이 출력된다.

        // static (공유 메모리 영역)에서만 바뀌었기 때문에 모든 객체가 영향을 받음

        // 27.
        Student st3 = new Student();
        System.out.println("st3의 이름 : " + st3.getName()); // null 나옴
        System.out.println("st3의 학교 : " + st3.schoolName); // KB유치원 나옴


    }

    // 28.예제 3 생성 => 이후 VO 패키지에서 클래스 people 생성
    public void ex3(){

        // 매개변수 생성자를 이용하여 객체 생성
        People p = new People("백지헌", '여', 24);
        System.out.println("이름 : " + p.getName()); // 여기서 p.name을 하면 오류가 난다. 따라서 간접 방식 getter를 쓰러 People로 간다.
        System.out.println("성별 : " + p.getGender());
        System.out.println("나이 : " + p.getAge());

        // 성별을 '여' -> '남'로 변경 ==> 다시 People 에서 setGender로 돌아간다.
        // 다시 바꾸고 돌아와서,
        p.setGender('남'); // ==> 이러면 this.gender = gender; 에 대입된다.

        
        // 30. -------------------------------------------------
        // 1) People 클래스의 toString() 오버라이딩 전
        // -> Object의 toString() 호출
        System.out.println(p); // 주소값
        // print 수행 시 참조변수 명만 작성하는 경우
        // 자동으로 toString() 메서드를 호출해서 출력한다.
        System.out.println(p.toString()); //위에 있는 것과 똑같이 나온다. ==> People로 최하단 Object.toString으로 이동
        
        // 2) People 클래스의 toString() 오버라이딩 후 
        // -> 오버라이딩된 자식 (People)의 toString() 호출

    }
}
