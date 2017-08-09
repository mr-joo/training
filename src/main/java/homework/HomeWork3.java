package homework;

import java.util.Scanner;

public class HomeWork3 {
    /*
    입력된 문자열을 확인한다
    개수를 셀 문자를 선택한다
    문자열을 한 글자씩 읽어들여 내가 입력한 문자와 동일한지 판단
     */

    public static void main(String[] args) {
        String str = "abbccc";

        for (int i = 0; i < str.length(); i++) {
            char tempt = str.charAt(i);
            System.out.println(tempt);
        }
        Scanner pickChar = new Scanner(System.in);
        System.out.printf("문자열에서 개수를 셀 문자를 선택해주세요 : ");
        String pickMe = pickChar.next();
        char pickedChar = pickMe.charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char tempt = str.charAt(i);
            if (pickedChar == tempt) {
                count++;
            }
        }
        System.out.printf("입력한 문자의 개수 : " + count);
    }
}
