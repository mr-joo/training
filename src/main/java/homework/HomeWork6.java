package homework;

import java.util.Scanner;

public class HomeWork6 {
    /*
    학점 계산기
    95 > A+ / A > 90 / 90 > B+ / 80 > B / 75 > c+ / 70 > c / 65 > D / 60 < F
     */

    public static void main (String[] args){
        Scanner scoreScanner = new Scanner(System.in);

        System.out.printf("점수를 입력하세요 : ");
        int score = scoreScanner.nextInt();

        if (95 <= score){
            System.out.printf("A+");
        } else if (90 <= score && 95 > score){
            System.out.printf("A");
        } else if (85 <= score && 90 > score){
            System.out.printf("B+");
        } else if (80 <= score && 85 > score){
            System.out.printf("B");
        } else if (75 <= score && 80 > score){
            System.out.printf("C+");
        } else if (70 <= score && 75 > score){
            System.out.printf("C");
        } else if (65 <= score && 70 > score){
            System.out.printf("D");
        } else {
            System.out.printf("F");
        }
    }
}
