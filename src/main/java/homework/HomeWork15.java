package homework;

public class HomeWork15 {
    /*
    class에서 static을 이용하여 계산기 기능을 만들고 class method로 접근하여 계산을 출력한다
     */

    public static class Calculator{
        public static int add(int a, int b){
            return a + b;
        }
        public static int sub(int a, int b){
            return a - b;
        }
        public static int mul(int a, int b){
            return a * b;
        }
        public static int div(int a, int b){
            return a / b;
        }
    }

    public static void main(String[] args){
        System.out.println(Calculator.add(3, 7));
        System.out.println(Calculator.sub(5, 2));
        System.out.println(Calculator.mul(4, 6));
        System.out.println(Calculator.div(9, 3));
        System.out.println(Calculator.mul(Calculator.add(1,  2), Calculator.add(3,  4)));
    }
}
