package homework;

public class HomeWork28 {
    /*
    evenOrOdd 메소드는 int형 num을 매개변수로 받습니다.
    num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하도록 evenOrOdd에 코드를 작성해 보세요.
    num은 0이상의 정수이며, num이 음수인 경우는 없습니다.
     */
    public static class EvenOrOdd{
        String evenOrOdd(int num){
            String result = "";

            if (num % 2 == 0){
                result = "Even";
            } else if (num % 2 == 1){
                result = "Odd";
            }
            return result;
        }
    }

    public static void main(String[] args){
        String str = "1 2 3 4";
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        System.out.println("result : " + evenOrOdd.evenOrOdd(3));
        System.out.println("result : " + evenOrOdd.evenOrOdd(2));
    }
}
