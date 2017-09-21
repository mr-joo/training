package homework;

public class HomeWork36 {
    /*
    2016년 1월 1일은 금요일입니다. 2016년 A월 B일은 무슨 요일일까요?
    두 수 A,B를 입력받아 A월 B일이 무슨 요일인지 출력하는 getDayName 함수를 완성하세요.
    요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT를 출력해주면 됩니다.
    예를 들어 A=5, B=24가 입력된다면 5월 24일은 화요일이므로 TUE를 반환하면 됩니다.
     Zeller's congruence
     H = (D+((13(M+1))/5)+YB+(YB/4)+(YA/4)-2YA)%7
     */
    static class TryHelloWorld
    {
        String getDayName(int a, int b) {
            String answer = "";
            String[] day = {"SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI"};
            int YA = 20;
            int YB = 16;
            int month = a;
            int days = b;

            if (month < 3){
                month = month + 12;
                YB = YB - 1;
            }

            int calc = (days + ((13 * (month + 1))/5) + YB + (YB /4) + (YA / 4) - (2 * YA)) % 7;

            switch (calc){
                case 0 :
                    return day[0];
                case 1 :
                    return day[1];
                case 2 :
                    return day[2];
                case 3 :
                    return day[3];
                case 4 :
                    return day[4];
                case 5 :
                    return day[5];
                case 6 :
                    return day[6];
            }

            return answer;
        }

        public static void main(String[] args)
        {
            TryHelloWorld test = new TryHelloWorld();
            int a=5, b=24;
            System.out.println(test.getDayName(a,b));
        }
    }

}
