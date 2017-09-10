package homework;

public class HomeWork24 {
    /*
    문제1. 문자열을 뒤집는 메서드를 만들어보자 (우선순위 : 중)
     */
    public static void main(String[] args) {

        String str = "elppa";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
