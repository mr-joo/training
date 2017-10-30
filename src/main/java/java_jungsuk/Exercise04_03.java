package java_jungsuk;

public class Exercise04_03 {
    public static void main(String[] args){
        int a = 0;
        int b = 0;

        for (int i = 1; i < 11; i++){
            b += i;
            a += b;
        }
        System.out.println(a);
    }
}
