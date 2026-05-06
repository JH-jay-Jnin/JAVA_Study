// #5. 스트림을 이용하여 list에 담긴 Product를 출력하세요
//     (toString 이용.)

package main.java.ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
      // List 컬렉션 생성
      List<Product> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Product product = new Product(
                    i, "상품"+i, "멋진회사", (int)(10000*Math.random())
            );
            list.add(product); // 만든 product 객체를 list에 추가
        }


        // 객체 스트림 얻기

        Stream<Product> stream = list.stream();
        //Stream<Product> : Product 객체들이 하나씩 흘러가는 파이프라인

        stream.forEach(p->System.out.println(p)); // == stream.forEach(System.out::println);

        // stream.forEach() : 스트림의 각 요소를 하나씩 꺼내서 처리
        // p -> System.out.println(p) : 흘러오는 각 Product를 p라고 부르고, println으로 출력
        // @Data 어노테이션이 toString()을 자동 생성했기 때문에
        //       → println이 내부적으로 p.toString()을 자동 호출하거든.

    }
}
