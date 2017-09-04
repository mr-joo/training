package homework;

public class HomeWork17 {
    /*
    파라미터로 전달된 값이 소수인지 아닌지 판단해서 소수인 경우 true,
    소수가 아닌 경우 false를 반환하는 메서드를 정의
     */
    public static boolean primeNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(4));
    }
}
