package homework;

public class HomeWork18 {
    /*
    파라미터로 전달된 n값만큼의 2^n 값 출력
     */
    public static void square(int n){
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= 2;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        square(3);
    }
}
