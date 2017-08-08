package homework;

import java.util.Scanner;

public class HomeWork6 {
    /*
    학점 계산기
    95 > A+ / 90 > A / 85 > B+ / 80 > B / 75 > c+ / 70 > c 65 > D 60 <= F
     */

    public static void main (String[] args){
        Scanner scoreScanner = new Scanner(System.in);

        System.out.printf("점수를 입력하세요 : ");
        int score = scoreScanner.nextInt();

        if (score >= 95){
            System.out.printf("A+");
        } if (score > 90){
            System.out.printf("A");
        } if (score >= 85){
            System.out.printf("B+");
        } if (score > 80){
            System.out.printf("B");
        } if (score > 75){
            System.out.printf("C+");
        } if (score > 70){
            System.out.printf("C");
        } if (score > 65){
            System.out.printf("D");
        } else {
            System.out.printf("F");
        }
    }
}
