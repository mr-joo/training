package homework;

public class HomeWork12 {
    /*
    이자 계산기
    부모는 이자를 주지 않는다
    단리 / 복리
     */
    static class Parents{
        double money = 1000000;
        int year = 2;
        double rate = 3;

        void print(){
            System.out.println(money);
        }
    }

    static class Simple extends Parents{
        public void simpleCalc(){
            double interest = (money * (rate / 100)) * year;

            System.out.println("단리 : " + (money + interest));
        }
    }

    static class Compound extends Parents{
        public void compoundCalc(){
            for (int i = 1; i <= year; i++){
                money = money + (money * (rate / 100));
            }
            System.out.println("복리 : " + money);
        }
    }

    public static void main(String[] args){
        Parents parents = new Parents();
        parents.print();

        Simple simple = new Simple();
        simple.simpleCalc();

        Compound compound = new Compound();
        compound.compoundCalc();
    }
}
