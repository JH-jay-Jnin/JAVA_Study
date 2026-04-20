package main.java.ch03_class.basic.se07.exam01.vo;

//1. 속성(인스턴스와 클래스로 나뉨)과 기능을 정의한다.
//2. 인스턴스 변수와 접근 제한자 예제를 확인한 다음 ClsRun.java로 간다.


public class Student {
    // 속성 (== 필드)

    //----------------------------------------------------------
    //접근제한자 종류

    // + public  	: 같은 패키지 + 다른 패키지 (모두, 어디서든) 접근 가능
    // # protected 	: 같은 패키지 + 다른 패키지 중 상속 관계 클래스에서만 접근 가능
    // ~ (default) 	: 같은 패키지 내부에서만 접근 가능
    // - private 	: 현재 클래스 (정확히는 현재 객체) 내부에서만 접근 가능

    // 인스턴스 변수
    public int v1 = 10;
    protected int v2 = 20 ;
    int v3 = 30;
    private int v4 = 40;

    // 접근제한자 예제
    public void ex(){
        System.out.println("같은 클래스 내부");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }

    // -------------------------------------------
    // 클래스 변수 (== static 변수)
    // 14. 
    // -> 필드에 static 예약어가 작성된 변수
    public static String  schoolName = "KB대학원";

    // 15. String name 이후 ClsService로 이동
    // 20. 캡슐화의 원칙 때문에, public으로 되어있던 것을 private으로 바꿔준다! 그리고 다시 ClsService로 가면 오류가 떠있음
    private String name;

    // 21. 따라서 간접 접근 방법이 필요하다. => getter/ setter !
    // getter와 setter
    // alt + insert -> Getter/ Setter을 하면 아래 같이 출력 됨.
    public String getName() { // 외부에서 부르면 String으로 name을 반환한다.
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    // 그리고 다시 ClsService로 돌아간다

    // 기능
}
