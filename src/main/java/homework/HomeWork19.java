package homework;

public class HomeWork19 {
    /*
    파라미터로 숫자를 받고 받은 숫자의 각 자리 합을 구한다
     */
    public static int sumNumber(int p){
        int sum = 0;

        for (int i = p; i != 0; i = i / 10){
            System.out.println(i % 10);
            sum += i % 10;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(sumNumber(123));
    }
}
