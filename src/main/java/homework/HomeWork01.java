package homework;

import java.util.Scanner;

public class HomeWork01 {
    /*
    2단부터 9단까지

    단수(int)를 입력받는다
    입력받은 단수에 1부터 9까지 곱셈
    곱셈 결과를 출력한다
    */
    public static void main(String[] args) {

        for (int i = 2; i < 10; i++) {
            System.out.println(i + "단 입니다.");

            for (int j = 1; j < 10; j++) {
                System.out.println(i * j);
            }
        }
    }
}

