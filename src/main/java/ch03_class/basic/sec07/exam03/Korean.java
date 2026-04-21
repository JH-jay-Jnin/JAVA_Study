package main.java.ch03_class.basic.sec07.exam03;

public class Korean {
    // 필드선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean (String name, String ssn) {
        // 정답.
        this.name = name;
        this.ssn  = ssn;
    }
}

