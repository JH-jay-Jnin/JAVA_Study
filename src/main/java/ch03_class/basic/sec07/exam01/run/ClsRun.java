package main.java.ch03_class.basic.sec07.exam01.run;

// 3. main 메소드 실행 후, 객체를 정의해준다. Student ex
// 4. ex메서드 호출해본다. 그리고 TestVO로 간다.

import main.java.ch03_class.basic.sec07.exam01.service.ClsService;
import main.java.ch03_class.basic.sec07.exam01.vo.Student;

public class ClsRun {
    public static void main(String[] args) {
        Student ex = new Student();

        // Student의 ex메서드 호출
        ex.ex();

        System.out.println("-------------------------");

        //13. 아래코드 입력 후 실행, 이후 Student.java로 간다.
        ClsService service = new ClsService();
       // service.ex1(); // 접근 제한자 예제 확인

        //24. 이름과 대학원 출력 => 그리고 다시 ClsService로 돌아간다
        // service.ex2();
        service.ex3(); // => 참조변수만을 작성하면 toString()이 출력된다. ClsService 최 하단으로 이동
    }
}
