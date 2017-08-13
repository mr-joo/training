package homework;

import java.util.Scanner;

public class HomeWork5_simple {
    /*
    이자 계산기 만들기
    원금, 이자율, 기간
    이자 금액 = 잔액 * 이자율
    총액 = 원금 + 이자 금액
     */
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.printf("원금을 입력해주세요 : ");
        int money = inputScanner.nextInt();

        System.out.printf("연이율을 입력해주세요 : ");
        double interestRate = inputScanner.nextDouble();

        System.out.printf("기간( 년)을 입력해주세요 : ");
        int period = inputScanner.nextInt();

        double interest = (money * (interestRate/100)) * period;
        System.out.println("이자 금액 : " + interest);

        double total = money + interest;

        System.out.println("총 금액 : " + total);
    }
}
