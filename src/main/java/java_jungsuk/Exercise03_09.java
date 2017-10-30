package java_jungsuk;

public class Exercise03_09 {
    public static void main(String[] args){
        char ch = 'z';
        boolean b = ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';

        System.out.println(b);
    }
}
