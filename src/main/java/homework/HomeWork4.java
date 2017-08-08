package homework;

import java.util.Scanner;

public class HomeWork4 {
    /*
    최대로 찍을 별 개수 입력
    입력한 수만큼 별을 찍는다
    1줄 추가될 때마다 별 개수 한개씩 줄어든다
    별이 줄어들어 1개가 되면 다음줄부터 한 개씩 늘어난다
    마지막 줄에 입력한 수의 별 개수만큼 별 찍으면 종료
     */
    public static void main(String[] args) {
        Scanner StarNumberScanner = new Scanner(System.in);
        System.out.println("별 개수를 입력해주세요 : ");
        int maxStarNumber = StarNumberScanner.nextInt();

        for (int line = 1; line <= maxStarNumber -1 ; line++) {
            for (int j = maxStarNumber; j > line - 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int line = 1; line <= maxStarNumber; line++) {
            for (int z = 1; z <= line; z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
