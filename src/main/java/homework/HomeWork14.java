package homework;

public class HomeWork14 {
    /*
    interface 사용
    class01 홀수단은 1부터 9까지 곱한 값 짝수단은 1부터 6까지 곱한 값까지 출력
    class02 곱한 결과가 2의 배수이거나 3의 배수라면 출력하지 않는다
    class03 각 단의 * 부터 출력한다 2단은 2 * 2부터, 3단은 3 * 3부터
     */
    public interface Gugudan{
        void print();
    }
    static class Case01 implements Gugudan{
        public void print(){
            System.out.println("짝수단은 6까지 곱하고, 홀수단은 9까지 곱하기");
            for (int i = 2; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    if ((i % 2) == 1 && j < 10){
                        System.out.println(i + "*" + j + "=" + (i * j));
                    }
                    if ((i % 2 == 0 && j < 7)){
                        System.out.println(i + "*" + j + "=" + (i * j));
                    }
                }
            }
        }
    }
    static class Case02 implements Gugudan{
        public void print(){
            System.out.println("곱셈 결과가 2의 배수거나 3의 배수면 미노출");
            for (int i = 2; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    if ((i * j) % 2 == 0 || (i * j) % 3 == 0){
                        continue;
                    }
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
            }
        }
    }
    static class Case03 implements Gugudan{
        public void print(){
            System.out.println("n*n부터 출력");
            for (int i = 2; i < 10; i++){
                for (int j = i; j < 10; j++){
                    System.out.println(i + "*" + j + "=" + (i * j));
                }
            }
        }
    }
    public static void main(String[] args){
        Case01 case01 = new Case01();
        case01.print();

        Case02 case02 = new Case02();
        case02.print();

        Case03 case03 = new Case03();
        case03.print();
    }
}
