package main.java.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {

        int r= 1;

        //  인스턴스 생성
        Calculator cal = new Calculator();
        Computer com = new Computer();


        // 계산값 모두 출력
        System.out.println("Calculator의 계산값 : " + cal.areaCircle(r));
        System.out.println();
        System.out.println("Computer의 계산값 : " + com.areaCircle(r));
    }
}
