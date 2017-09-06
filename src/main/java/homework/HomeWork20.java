package homework;

import javafx.scene.Parent;
import sun.security.krb5.internal.PAData;

public class HomeWork20 {
    /*
    문제 #1. 오버라이딩
    부모 클래스 1개와 인터페이스 1개를 만든다.
    자식 클래스들은 부모 클래스를 상속하면서 동시에 인터페이스를 구현한다.
    자식 클래스에서는 아래와 같은 것을 출력하는데, 출력 앞뒤에 부모에 있는 메서드를 호출하여
    "==시작==", "==끝==" 이라는 문구를 출력한다.
    1) 구구단 곱한 결과가 소수(prime number)인 경우 출력하지 않는다.
    2) 구구단 곱한 결과의 자리수 합이 짝수인 경우 출력하지 않는다.
     */
    static class Parent {
        public void printStart() {
            System.out.println("==Start==");
        }

        public void printEnd() {
            System.out.println("==End==");
        }
    }

    interface interfaceI {
        void print();
    }

    //1) 구구단 곱한 결과가 소수(prime number)인 경우 출력하지 않는다.
    static class Child01 extends Parent implements interfaceI {
        public void print() {
            printStart();
            for (int i = 2; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    int result = i * j;

                    if (isPrime(result)){
                        continue;
                    }
                    System.out.println(i + "*" + j + "=" +result);
                }
            }
            printEnd();
        }
        public boolean isPrime(int result){
            for (int i = 2; i < result; i++){
                if (result % i == 0){
                    return false;
                }
            }
            return true;
        }

    }

    //2) 구구단 곱한 결과의 자리수 합이 짝수인 경우 출력하지 않는다.
    static class Child02 extends Parent implements interfaceI{
        public void print(){
            printStart();
            for (int i = 2; i < 10; i++){
                for (int j = 1; j < 10; j++){
                    int result = i * j;

                    if (isEven(result)){
                        continue;
                    }
                    System.out.println(i + "*" + j + "=" +result);
                }
            }
            printEnd();
        }
        public boolean isEven(int result){
            int sum = 0;

            for (int z = result; z != 0; z = z / 10) {
                sum += z % 10;
            }

            if (sum % 2 == 0){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        //interfaceI interfaceI1 = new Child01();
        //interfaceI1.print();

        interfaceI interfaceI2 = new Child02();
        interfaceI2.print();
    }
}
