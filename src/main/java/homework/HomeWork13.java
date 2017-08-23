package homework;

public class HomeWork13 {
    /*
    abstract 이용한 구구단
    짝수 구구단 / 리버스 구구단 / 곱한 결과가 3의 배수인 구구단 출력
     */
    abstract static class ParentsGuGu{
        abstract void print();
    }

    static class EvenNumber extends ParentsGuGu{
        void print(){

            System.out.println("짝수단");

            for (int i = 2; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    if (i % 2 == 0){
                        System.out.println(i + "*" + j + "=" + (i * j));
                    }
                }
            }
        }
    }

    static class Reverse extends ParentsGuGu{
        void print(){

            System.out.println("리버스 구구단");

            for (int i = 9; i > 1; i--){
                for (int j = 1; j < 10; j++){
                        System.out.println(i + "*" + j + "=" + (i * j));
                }
            }
        }
    }

    static class Multiple extends ParentsGuGu{
        void print(){

            System.out.println("결과값이 3의 배수인 아이들");

            for (int i = 2; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    if (((i * j) % 3) == 0){
                        System.out.println(i + "*" + j + "=" + (i * j));
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        ParentsGuGu p1 = new EvenNumber();
        p1.print();

        ParentsGuGu p2 = new Reverse();
        p2.print();

        ParentsGuGu p3 = new Multiple();
        p3.print();
    }
}
