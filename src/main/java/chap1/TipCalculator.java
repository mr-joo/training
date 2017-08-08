package chap1;

import java.util.Scanner;

public class TipCalculator {
    /*
    금액 입력
    팁 비율 입력
    팁 금액 계산
    반올림
    금액 + 팁 금액 계산
    */

    double myAmount;
    int myTipRate;

    public void inputAmount(double amount) {
        myAmount = amount;
    }

    public void inputTipRate(int tipAmount){
        myTipRate = tipAmount;
    }

    public double calc(){
       double tipAmount = myAmount * ((double) myTipRate / 100);
       double totalAmount = myAmount + tipAmount;
       return totalAmount;
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("금액을 입력해주세요 : ");
        double amount = inputScanner.nextDouble();

        System.out.print("팁 비율을 입력해주세요 : ");
        int tipRate = inputScanner.nextInt();

        double tipAmount = amount * ((double) tipRate / 100);

        System.out.print("총 금액 : ");
        System.out.println(amount + tipAmount);

    }
}
