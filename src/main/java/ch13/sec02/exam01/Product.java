// # 3. 다음 조건을 만족하는 Product 클래스를 정의하세요.
//     - 멤버 변수 kind, model을 제너릭으로 운영
//     - 각각의 멤버에 대해 Getter, Setter 메서드를 직접 정의
//       ( Lombok 사용 불가 )
package main.java.ch13.sec02.exam01;

public class Product<T1, T2> {

    private T1 kind;
    private T2 model;

    public T1 getKind() {
        return kind;
    }

    public void setKind(T1 kind) {
        this.kind = kind;
    }

    public T2 getModel() {
        return model;
    }

    public void setModel(T2 model) {
        this.model = model;
    }
}
