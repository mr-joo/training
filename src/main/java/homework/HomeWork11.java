package homework;

public class HomeWork11 {
    /*
    abstract를 사용한 계산기
    add / sub / mul / div
     */
    static abstract class ParentCalc{
        int a = 8;
        int b = 3;

        abstract void print();
    }

    static class Add extends ParentCalc{
        void print(){
            System.out.println(a + "+" + b + "=" + (a + b));
        }
    }

    static class Sub extends ParentCalc{
        void print(){
            System.out.println(a + "-" + b + "=" + (a - b));
        }
    }

    static class Mul extends ParentCalc{
        void print(){
            System.out.println(a + "*" + b + "=" + (a * b));
        }
    }

    static class Div extends ParentCalc{
        void print(){
            System.out.println(a + "/" + b + "=" + (a / b));
        }
    }

    public static void main(String[] args){
        ParentCalc p1 = new Add();
        p1.print();

        ParentCalc p2 = new Sub();
        p2.print();

        ParentCalc p3 = new Mul();
        p3.print();

        ParentCalc p4 = new Div();
        p4.print();
    }
}
