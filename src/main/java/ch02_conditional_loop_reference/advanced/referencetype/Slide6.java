package main.java.ch02_conditional_loop_reference.advanced.referencetype;

public class Slide6 {
    public static void main(String[] args) {
        int[][] array ={
                {95, 86}, // array[0] -> index 0행, 요소 2개
                {83, 92, 96}, // array[1] -> index 1행, 요소 3개
                {78, 86, 93, 87, 88} // array[2] -> index 2행, 요소 5개
        };

        System.out.println(array.length); // 3
        System.out.println(array[2].length); // 5
    }
}
