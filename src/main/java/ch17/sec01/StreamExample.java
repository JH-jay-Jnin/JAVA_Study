// #1. 스트림을 이용하여 다음과 같이
//     출력하는 코드를 완성하세요.

package main.java.ch17.sec01;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet< >();
        // Set 컬렉션 생성
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        // 이어서 Stream을 이용하여 위에서 아래로 출력되는 코드 생성
        //       => Stream을 이용한 요소 반복 처리
        // (설명추가) :
        // set 안의 데이터를 흘려보낼 새로운 파이프라인(Stream)을 생성하는 과정 = 스트림 요소 처리
        // set 원본은 그대로 유지되고, Stream은 데이터를 순서대로 처리할 수 있는 새로운 통로를 만들어 줌.

        Stream<String> stream = set.stream();
        stream.forEach(System.out::println);


        // set.stream()  → set 컬렉션이 가진 .stream() 메소드를 호출해서 컬렉션 안의 요소들을 스트림으로 변환.

        // stream.forEach() → 스트림의 최종 연산 메소드
        // System.out::println :
        // System.out.println(요소) 를 각 요소마다 실행하라는 뜻, 람다식으로 쓰면 name -> System.out.println(name)이다.

    }
}
