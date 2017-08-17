package homework;

public class HomeWork10 {
    /*
    클래스로 구구단 만들기
    리버스 구구단 만들기
     */
    public static void main(String[] args) {
        class NormalGugudan {
            int a;

            public NormalGugudan(int a) {
                this.a = a;
            }

            public void calculator() {
                System.out.println(a + "단 입니다.");
                for (int i = 1; i < 10; i++) {
                    System.out.println(a * i);
                }
            }
        }

        class ReverseGugudan {
            int a;

            public ReverseGugudan(int a) {
                this.a = a;
            }
            public void calculator() {
                System.out.println(a + "단 입니다.");
                for (int i = 9; i >= 1; i--) {
                    System.out.println(a * i);
                }
            }
        }
        NormalGugudan gugudan = new NormalGugudan(3);
        ReverseGugudan reverse = new ReverseGugudan(4);

        gugudan.calculator();
        reverse.calculator();
    }
}
