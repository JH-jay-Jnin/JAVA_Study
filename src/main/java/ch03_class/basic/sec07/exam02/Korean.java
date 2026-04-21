package main.java.ch03_class.basic.sec07.exam02;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean (String name, String ssn){
        this.name = name;
        this.ssn  = ssn;
        System.out.println("name : "  + name);
        System.out.println("ssn : "  + ssn);
    }
}
