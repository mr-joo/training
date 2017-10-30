package java_jungsuk;

public class Exercise04_06 {
    public static void main(String[] args){
        for (int i = 1; i < 7; i++){
            for (int j = 1; j < 7; j++){
                int result = i + j;

                if (result == 6){
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
