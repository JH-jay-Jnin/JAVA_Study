package main.java.ch09_collection_generic.collection.list.ex;

import java.util.ArrayList;
import java.util.List;

public class ListEX {
    // 컬렉션 특징
    // 1) 크기 제한 X
    // 2) 추가, 수정, 삭제 등의 코드가 구현되어 있다.
    // 3) 객체만 저장 가능

    // List : 자료를 순차적으로 나열한 자료구조 (배열과 비슷)
    // - 특징 1 : 인덱스를 이용해서 순서를 구분
    // - 특징 2 : 순서가 구분되기 때문에 중복 데이터 저장 가능

    public void ex1() {
        // 다형성 (업캐스팅)
        List list = new ArrayList(3);

        // 1. boolean add(E e) : 마지막 요소로 추가
        // E (Element) : 요소를 뜻하는 상징적인 글자 (자료형 아님)
        list.add("글자"); // String은 객체이다.

        // 기본 자료형이 저장되는 이유
        // -> Wrapper class : 기본 자료형 -> 객체로 포장하는 클래스 (컴파일러가 자동으로 해줌)

        // Auto Boxing
        list.add(123); // int -> Integer
        list.add(3.15); // double -> Double

        // * 컬렉션에 저장되는 객체의 타입은 제한이 없다!
        System.out.println(list);

        list.add("리스트의 크기(3) 초과");
        System.out.println(list);
        // -> list의 크기를 초과해도
        //     자동으로 크기가 늘어나기 때문에 에러 발생 X
        //     즉, 안쓰면 알아서 줄여주고! 작으면 알아서 늘려준다!

        // 2. E get(int index) : 지정한 index 요소 얻어오기
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        System.out.println("--------------------------------");

        // 진짜로 자동 포장(Auto Boxing)이 되었는지 확인
        // a instanceof b : a가 b타입이거나, b의 자식(하위 타입)이라면 Ture 반환
        System.out.println(list.get(1) instanceof Integer); // true
        System.out.println(list.get(2) instanceof Double); // true
        System.out.println(list.get(2) instanceof Object); // true => 모든 객체의 최상위 타입인 Object 이기 때문!

        // List + for문 + if + instanceof + 다운캐스팅

        // int list.size() : 저장된 객체의 개수를 반환
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i).charAt(0)); // 오류가 난다면, list.get(i)가 Object이고 charAt(0)가 String이기 때ㅜㅁㄴ
            // ==> 다운캐스팅 필요

            // i번째 요소가 String인 경우에만 DownCasting


                if (list.get(i) instanceof String) {
                    String str = (String) list.get(i);
                    System.out.println(str.charAt(0));


                // Integer인 경우
                if (list.get(i) instanceof Integer) {
                    // Auto Unboxing
                    int num = (int) list.get(i);
                    // int = Integer
                    //       Integer -> int
                    System.out.println(100 + num);
                }

                // Double인 경우
                if (list.get(i) instanceof Double) {
                    Double d = (Double) list.get(i); // 다운 캐스팅!

                    System.out.println(Double.BYTES);
                }
            }
        }
    }

    public void ex2() {
        // 컬렉션의 장점 중 "여러 타입 저장 가능" 때문에
        // instanceof로 타입 검사를 해야하는 코드가 추가되어
        // 코드의 길이가 늘어나는 문제점 발생

        // => 타입을 하나로 제한하자!
        // ===> Generics(제네릭)을 이용

        // String으로 타입이 제한된 List ==> 자식도 String으로 받을 수 있도록
        List<String> list = new ArrayList<String>();
        // 타입 추론 ( 써도 되고, 안 써도 그만 => 여기 String이 까맣다.)
        // ArrayList<>에 타입 미작성 시
        // 부모의 제네릭 <String>을 보고
        // String만 들어올 수 있게 한다.

        list.add("망고빙수");
        list.add("티라미슈");
        // list.add(500); // String으로만 해야하는데 int값을 주었기에 오류가 난다!

    }
}

