// #3. 스트림을 이용하여 다음과 같이 출력되도록 코드를 완성하세요.
//     => 스트림 처리시 "메서드 체인닝"을 사용함.

package main.java.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("백지헌", 10),
                new Student("이새롬", 20),
                new Student("카리나", 30)
        );

        double avg = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg );


        // 1. mapToInt = 스트림의 각 요소를 int 숫자로 변환해줘! 라는 뜻이야.
        //    Stream<Student> -> [홍길동, 신용권, 유미선] 이렇게 student stream 객체에 각각 객체가 담겨있음.
        //
        //    mapToInt(student -> student.getScore())
        //    이 부분은 IntStream -> [10, 20, 30]으로 바뀌게 된다.

        // 2. getAsDouble : 스트림이 텅 비어있으면, 평균을 계산할 수 없기에, OptionalDouble을 담아서 값의 유무를 반환하는 것
        //    OptionalDouble avg = scoreStream.average(); ==> 20.0이 들어 있는 상태
        //
        //    따라서, 실제 double 값을 꺼내려면 .getAsDobule()을 호출해야 한다.


/**        다른 풀이
        Stream<Student> studentStream = list.stream();
        IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
        double avg = scoreStream.average().getAsDouble();

        System.out.println("평균 점수 : " + avg ); */
    }
}

