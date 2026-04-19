package main.java.ch02_conditional_loop_reference.basic.ch06.sec00;

import java.util.Scanner;

public class ScannerExample2 {
    public static void main(String[] args) {
        /*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을
		 * for문을 이용하여 출력하세요.

			ex.
			정수를 하나 입력하세요 : 8
			1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		 */
        // 스캐너 생성
        Scanner sc = new Scanner(System.in); // sc는 변수명이라 크게 상관 ㄴㄴ

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt(); // 정수 입력
        int sum = 0; // 합계 저장용 변수

        for (int core = 1; core <= num;  core++) {
            if (core < num){ // 마지막 번호가 아닐 때
                System.out.print(core + " + ");
            } else { // 마지막 번호일 때
                System.out.print(core + " = ");
            }
            sum += core;
        } // for문 종료 지점
        System.out.println(sum);
    }
}
