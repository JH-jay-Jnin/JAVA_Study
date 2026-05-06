// #6. 아래와 같이 출력되도록 스트림을 이용한 코드를 완성하세요.

package main.java.ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};

        Stream<String> str = Arrays.stream(strArray);
        str.forEach(item -> System.out.print(item + ","));
        System.out.println();

        int[] intArray = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item -> System.out.print(item + ","));
    }
}
