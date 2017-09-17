package homework;

import java.util.Arrays;

public class HomeWork29 {
    /*
    divisible 메소드는 int형 배열 array와 int divisor를 매개변수로 받습니다.
    array의 각 element 중 divisor로 나누어 떨어지는 값만 포함하는 새로운 배열을 만들어서 반환하도록 divisible에 코드를 작성해 보세요.
    예를들어 array가 {5, 9, 7, 10}이고 divisor가 5이면 {5, 10}을 리턴해야 합니다.
    */

    static class Divisible{
        public int[] divisible(int[] array, int divisor){
            //ret에 array에 포함된 정수 중 divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
            //array % divisor == 0
            int count = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] % divisor == 0){
                    count++;
                }
            }
            int ret[] = new int[count];
            System.out.println(count);
            int index = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] % divisor == 0){
                    ret[index++] = array[i];
                }
            }
            return ret;
        }
    }

    public static void main(String[] args){
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.printf(Arrays.toString(div.divisible(array, 5)));
    }
}
