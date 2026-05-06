// #4. 롬복을 이용하여 전체 매개변수를 가지는
//     생성자, Getter, Setter, toString을 정의하세요

package main.java.ch17.sec04.exam01;

import lombok.*;

@AllArgsConstructor
@Data
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

}
