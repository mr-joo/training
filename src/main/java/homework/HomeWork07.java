package homework;

public class HomeWork07 {
    /*
    계산기 프로그램
    덧셈 뺏셈 곱셈 나눗셈 연산
    2개의 값을 이용한다
    생성자를 이용한다
    */
    public static void main(String[] args) {

        class Calculator {
            int a;
            int b;

            public Calculator(int v1, int v2){
                a = v1;
                b = v2;
            }

            public int add() {
                return a + b;
            }

            public int sub() {
                return a - b;
            }

            public int mul(){
                return a * b;
            }

            public int div() {
                return a / b;
            }
        }

        Calculator calculator = new Calculator(6, 3);

        System.out.println("덧셈 결과 : " + calculator.add());
        System.out.println("뺄셈 결과 : " + calculator.sub());
        System.out.println("곱셈 결과 : " + calculator.mul());
        System.out.println("나눗셈 결과 : " + calculator.div());
    }
}
