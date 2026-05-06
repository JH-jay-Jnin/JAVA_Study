package main.java.ch12_stream.exam3_optional;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        // 값 접근 메서드

        // 값이 있는 Optional
        Optional<String> str = Optional.of("Bye");

        // 값이 없는 Optional
        Optional<String> empty = Optional.empty();

        // 1. get() : 값이 존재하면 반환, 없으면 예외 발생(NoSuchElementEXception)
        String value1 = str.get();
        // String value2 = empty.get(); // 예외발생 오류
        System.out.println("value1 : " + value1);
        System.out.println("-------------------------------------");

        // 2. orElse() : 값이 존재하면 반환, 없으면 기본값 반환
        // -> str에 값이 있어도 "default"을 만들어둠
        String defaultValue1 = str.orElse("default");
        String defaultValue2 = empty.orElse("default"); // 값이 없으면 orElse뒤에 있는 설정한 값 default를 반환해줌
        System.out.println("defaultValue1 : " + defaultValue1);
        System.out.println("defaultValue2 : " + defaultValue2);

        System.out.println("-------------------------------------");

        // 3. orElseGet() : 값이 존재하면 반환, 없으면 값 반환 (Supplier로부터 값을 가져옴)
        // -> 값이 없을때만 만들어줌. ==> 성능적으로는 불필요한 연산이 없는 orElseGet이 좀 더 좋음
        String computed1 = str.orElseGet(()->"Supplier Default Value");
        String computed2 = empty.orElseGet(()->"Supplier Default Value");
        System.out.println("computed1 : " + computed1);
        System.out.println("computed2 : " + computed2);

        System.out.println("-------------------------------------");

        // 4. orElseThrow() :  값이 존재하면 반환, 없으면 지정된 예외 발생
        String throwException1 = str.orElseThrow(()-> new IllegalArgumentException("값 없음"));
        // String throwException2 = empty.orElseThrow(()-> new IllegalArgumentException("값 없음"));

        System.out.println("throwException1 : " + throwException1);
    }
}
