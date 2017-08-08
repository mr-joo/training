package chap1;

import java.util.Scanner;

public class Chapter1 {
    /*
    금액과 팁 비율을 입력받아 팁 금액과 전체금액을 출력
    팁은 반드시 퍼센트로 입력 받아야 함
    센트단위로 반올림

    1. 금액을 입력 받는다
    2. 팁 비율을 입력 받는다
    3. 금액 * (팁 비율 / 100) = 팁 금액
    4. 반올림해서 소수 두자리까지 표시
    5. 전체금액 = 금액 + 팁 금액 표시한다
     */

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        //amountScanner.nextDouble();
        double amount = inputScanner.nextDouble();
        System.out.println(amount);

        int tipRate = inputScanner.nextInt();
        System.out.println(tipRate);

        double tipAmount = Math.round(amount * ((double)tipRate / 100));
        System.out.println(tipAmount);

        double totalAmount = amount + tipAmount;
        System.out.println(totalAmount);

    }


}
