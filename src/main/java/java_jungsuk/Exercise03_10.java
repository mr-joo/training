package java_jungsuk;

public class Exercise03_10 {
    public static void main(String[] args){
        char ch = 'A';

        char lowerCase = (ch >= 'A' && ch <= 'Z')? (char)(ch + 32) : ch;

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
