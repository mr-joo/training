package homework;

public class HomeWork31 {
    /*
    행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
    2개의 행렬을 입력받는 sumMatrix 함수를 완성하여 행렬 덧셈의 결과를 반환해 주세요.
    예를 들어 2x2 행렬인 A = ((1, 2), (2, 3)), B = ((3, 4), (5, 6)) 가 주어지면,
    같은 2x2 행렬인 ((4, 6), (7, 9))를 반환하면 됩니다.(어떠한 행렬에도 대응하는 함수를 완성해주세요.)
     */
    static class SumMatrix{

        int[][] sumMatrix(int[][] A, int[][] B){
            int[][] answer = {{0, 0}, {0, 0}};
            int sl = A.length;

            for (int i = 0; i < sl; i++) {
               for (int j = 0; j < sl; j++){
                   answer[i][j] = (A[i][j] + B[i][j]);
               }
            }
            return answer;
        }
    }

    public static void main(String[] args){
        SumMatrix c = new SumMatrix();
        int[][] A = {{1, 2}, {2, 3}};
        int[][] B = {{3, 4}, {5, 6}};
        int[][] answer = c.sumMatrix(A, B);
        if (answer[0][0] == 4 && answer[0][1] == 6){
            System.out.println("Right");
        }else {
            System.out.println("Wrong");
        }
    }
}
