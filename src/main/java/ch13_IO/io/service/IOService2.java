package main.java.ch13_IO.io.service;

import lombok.SneakyThrows;

import java.io.*;

public class IOService2 {
    // try-with-resources
    // -> try() 안에서 생성한 스트림 객체는 try 종료 시 자동으로 close 수행한다.

    // 실행 순서
    // try 실행 -> catch (예외 발생 시. 아니면 생략) -> 자동 close() -> finally 실행


    // Byte 기반 파일 출력
    @SneakyThrows
    public void byteOutput() {
        try(FileOutputStream fos
                    = new FileOutputStream("src/main/java/ch13_IO/io/byte/byteTest.txt")) {

            // 현재 프로그램에서 해당 경로에 byteTest.txt 파일로 출력하는 통로 객체 생성

            String content = "Hello 백지헌 서브웨이 샐러드";

            for (int i = 0; i < content.length(); i++) {
                // System.out.println(content.charAt(i));

                fos.write(content.charAt(i));
            }
            System.out.println("출력 완료");

        } catch (FileNotFoundException e) {
            // IO 관련된 코드는 IOException을 발생 시킬 가능성이 높다.
            System.out.println("예외 발생");
            e.printStackTrace(); // 예외가 발생한 메서드까지의 모든 내용 출력

        }
    }

    // 문자 기반 파일 출력
    public void charOutput(){
        try(FileWriter fw = new FileWriter("src/main/java/ch13_IO/io/char/charTest.txt")) {
            // char 폴더에 charTest.txt가 있으면, 문자 출력 스트림 연결
            // 만약 파일이 없다면 해당 경로에 파일을 만들어서 연결

            String content = "곧 조 발표 합니다 ^-^ 프로미스나인 백지헌 많이 사랑해주세요~";

            fw.write(content);
            // 버퍼에 남아있는 내용을 강제로 출력
            // flush()는 선택 사항
            // close() 시 자동으로 flush() 수행됨
            fw.flush();

            System.out.println("출력 완료");
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("작업 완료"); // 이렇게 flush를 써서 finally를 쓸 수도 있다.
        }
    }

    // Byte 기반 파일 입력
    public void byteInput(){
        try(FileInputStream fis
                    = new FileInputStream("src/main/java/ch13_IO/io/byte/byteTest.txt")) {

            while(true){
                int data = fis.read(); // 다음 1byte를 읽어오는데 정수형이다.
                                        // 다음 내용이 없으면 -1 반환
                if (data == -1) break;

                System.out.print((char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("작업 완료");
        }
    }

    // 문자 기반 파일 입력
    public void charInput() {
        try (FileReader fr = new FileReader("src/main/java/ch13_IO/io/char/charTest.txt")) {

            while(true){
                int data = fr.read(); // 다음 1byte를 읽어오는데 정수형이다.
                // 다음 내용이 없으면 -1 반환
                if (data == -1) break;

                System.out.println((char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.print("작업 완료");
        }
    }

}
