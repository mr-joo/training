package homework;

import java.util.Scanner;

public class HomeWork05_compound {
    /*
    원금 이자율 기간(년)을 입력 받는다
    연 복리 계산
    */
    public static void main (String[] args){
        Scanner inputScanner = new Scanner(System.in);

        System.out.printf("원금을 입력해주세요 : ");
        double money = inputScanner.nextInt();

        System.out.printf("연이율을 입력해주세요 : ");
        double interestRate = inputScanner.nextDouble();

        System.out.printf("기간( 년)을 입력해주세요 : ");
        int period = inputScanner.nextInt();

        double total = money;

        for (int i = 1; i <= period; i++){
            money = total;
            double interest = (money * (interestRate/100));
            total = money + interest;
        }
        System.out.printf("총 금액 :" +total);
    }
}
