package homework;

import java.util.Scanner;

public class HomeWork3 {
    /*
    입력된 문자열을 확인한다
    개수를 셀 문자를 선택한다
    문자열을 한 글자씩 읽어들여 내가 입력한 문자와 동일한지 판단

     */

    public static void main (String[] args){
        String str = "abbccc";
        //System.out.println("글자를 선택할 문자열 : " +str);
        //System.out.print("문자열에서 글자를 선택해주세요 : ");

        //Scanner pickText = new Scanner(System.in);
        //String text = pickText.nextLine();

        for (int i=0; i<str.length(); i++){
            char tempt = str.charAt(i);
            System.out.println(tempt);
        }
    }
}
