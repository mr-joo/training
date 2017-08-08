package chap1;

import org.junit.Test;

public class Chapter1Test {

    @Test
    public void test() {
        TipCalculator calculator = new TipCalculator();
        calculator.inputAmount(60);
        calculator.inputTipRate(10);
        double totalAmount = calculator.calc();

        if (totalAmount == 66){
            System.out.println("Pass");
        } else {
            System.out.println(totalAmount);
            System.out.println("Fail");
        }
    }
}
