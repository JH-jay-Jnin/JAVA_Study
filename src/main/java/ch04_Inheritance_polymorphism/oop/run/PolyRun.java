package main.java.ch04_Inheritance_polymorphism.oop.run;

import main.java.ch04_Inheritance_polymorphism.oop.model.service.PolyService;

public class PolyRun {
    public static void main(String[] args) {
        PolyService service = new PolyService(); // 변수 선언 및 초기화 (Stack에는 PolyService service | Heap 영역에는 new PolyServcie() 생성

        service.ex1(); // 1. PolyService로 이동
    }
}
