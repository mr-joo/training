package homework;

public class HomeWork21 {
    /*
    문제 #2. 오버로딩
    static 메서드를 만든다.
    오버로딩을 통해 아래의 동작을 하는 메서드를 만들어본다.
    1) 파라미터 1개 : 1부터 해당 값까지의 합
    2) 파라미터 2개 : 첫번째 파라미터부터 두번째 파라미터 값까지의 합 (두번째 파라미터가 첫번째 파라미터보다 항상 크다고 가정)
     */
    public static class OverLoading{
        public int rangeSum(int a){
            int result = 0;

            for (int i = 0; i <= a; i++){
                result += i;
            }
            return result;
        }

        public int rangeSum(int a, int b){
            int result = 0;

            for (int i = a; i <= b; i++){
                result += i;
            }
            return result;
        }
    }


    public static void main(String[] args){
        OverLoading overLoading = new OverLoading();

        System.out.println(overLoading.rangeSum(4));
        System.out.println(overLoading.rangeSum(3, 5));
    }
}
