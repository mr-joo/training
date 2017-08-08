package homework;

import java.util.Scanner;

public class HomeWork2 {
    /*
    별 개수 입력
    1개부터 시작해서 줄바꿈되어 한 개씩 증가
    입력된 값은 한 줄에 노출되는 최대 별 개수
    최대 별 개수 노출되면 다음줄부터 한 개씩 감소
    마지막 줄에 별 한 개 노출

    이 프로그램은 여러줄에 여러개의 별을 찍는 프로그램이다
    전체 줄의 수는 입력받은 수 n * 2 - 1 이다.
    첫번째 줄 부터 n줄 까지는 별의 갯수를 증가해서 출력하고
    n줄 부터 마지막 줄 까지는 별의 갯수를 감소해서 출력한다

    */

    public static void main(String[] args) {
        Scanner starNumberScanner = new Scanner(System.in);
        System.out.println("별 개수를 입력해주세요 : ");
        int maxStarNember = starNumberScanner.nextInt();

        for (int line = 1; line <= maxStarNember; line++) {
            /*
            별을 i만큼 출력한다
            */
            for (int j = 1; j <= line; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int line = 1; line <= maxStarNember; line++) {
            for (int z = maxStarNember - 1; z > line - 1; z--) {

                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
