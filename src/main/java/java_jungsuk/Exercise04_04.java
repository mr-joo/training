package java_jungsuk;

public class Exercise04_04 {
    public static void main(String[] args){
        int sum = 0;
        int a = 1;
        int num = 0;

        for (int i = 1; sum < 100; i++, a = -a){
            num = a * i;
            sum += num;
        }
        System.out.println(num);
    }
}
