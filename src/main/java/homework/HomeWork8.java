package homework;

public class HomeWork8 {
    public static void main (String[] args){

        class Simple {
            double money;
            int year;
            double rate;

            public Simple (double money, int year, double rate){
                this.money = money;
                this.year = year;
                this.rate = rate;
            }

            public double calculator() {
                double interest = (money * (rate / 100)) * year;
                double total = money + interest;
                return total;
            }
        }

        class Compound {
            double money;
            int year;
            double rate;

            public Compound(double money, int year, double rate) {
                this.money = money;
                this.year = year;
                this.rate = rate;
            }

            public double calculator() {
                for (int i = 1; i <= year; i++) {
                    double interest = money * (rate / 100);
                    money = money + interest;
                }
                return money;
            }
        }
        Simple simple = new Simple(1000000, 3, 4);
        Compound compound = new Compound(1000000, 2, 5);

        System.out.println("단리 : " + simple.calculator() + "원");
        System.out.println("복리 : " + compound.calculator() + "원");
    }
}
